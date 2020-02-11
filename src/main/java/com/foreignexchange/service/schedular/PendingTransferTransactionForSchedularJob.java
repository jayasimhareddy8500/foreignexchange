package com.foreignexchange.service.schedular;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.foreignexchange.common.ForeignExchangeEnum.TransferStatus;
import com.foreignexchange.entity.UserAccount;
import com.foreignexchange.entity.UserTransaction;
import com.foreignexchange.repository.UserAccountRepository;
import com.foreignexchange.repository.UserTransactionRepository;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableScheduling
@Slf4j
@Transactional
public class PendingTransferTransactionForSchedularJob {

	@Autowired
	UserTransactionRepository userTransactionRepository;

	@Autowired
	UserAccountRepository userAccountRepository;

	@Scheduled(cron = "0 0/1 * * * *")
	public void executeTask() {
		log.info("pending transfer transaction cron executed.........");

		List<UserTransaction> userTransactions = userTransactionRepository.findAllByStatus(TransferStatus.PENDING);
		userTransactions.forEach(userTransaction -> {
			System.out.println("TransactionID:: " + userTransaction.getUserTransactionId());

			UserAccount fromUserAccount = userTransaction.getFromUserAccount();

			// Check Total debited amount present in account or not.
			if (fromUserAccount.getAvailableBalance() < userTransaction.getTransferAmount()) {
				log.error("Error Occured in transferAmount transferaa mount more than in Available Balance...");

				Double afterDebitRemitCharge = fromUserAccount.getAvailableBalance() - userTransaction.getRemitChange();
				fromUserAccount.setAvailableBalance(afterDebitRemitCharge);
				userAccountRepository.save(fromUserAccount);

				userTransaction.setStatus(TransferStatus.CANCELLED);
				userTransactionRepository.save(userTransaction);
			} else {
				log.error("Succefully updated the status detail for pending transfer...");

				Double afterDebitAmount = fromUserAccount.getAvailableBalance() - userTransaction.getTransferAmount();
				fromUserAccount.setAvailableBalance(afterDebitAmount);
				userAccountRepository.save(fromUserAccount);

				userTransaction.setStatus(TransferStatus.TRANSFERED);
				userTransactionRepository.save(userTransaction);
			}
		});

	}
}
