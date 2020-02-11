package com.foreignexchange.service;

import com.foreignexchange.dto.TransferRequestDto;
import com.foreignexchange.dto.TransferResponseDto;
import com.foreignexchange.exception.UserAccountNotFoundException;
import com.foreignexchange.exception.UserNotFoundException;

public interface UserAccountTransactionService {

	public TransferResponseDto transferAmount(Integer userId, Long accountNumber,
			TransferRequestDto transferRequestDto) throws UserNotFoundException, UserAccountNotFoundException;
}
