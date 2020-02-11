package com.foreignexchange.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.foreignexchange.dto.TransferRequestDto;
import com.foreignexchange.dto.TransferResponseDto;
import com.foreignexchange.exception.UserAccountNotFoundException;
import com.foreignexchange.exception.UserNotFoundException;
import com.foreignexchange.service.UserAccountTransactionService;

@RunWith(MockitoJUnitRunner.class)
public class UserAccountTransactionControllerTest {

	@InjectMocks
	UserAccountTransactionController userAccountTransactionController;

	@Mock
	UserAccountTransactionService userAccountTransactionService;

	TransferRequestDto transferRequestDto = new TransferRequestDto();
	TransferResponseDto transferResponseDto = new TransferResponseDto();

	@Before
	public void init() {
		transferRequestDto.setToAccountNumber(50002L);

		transferResponseDto.setStatusCode(200);
	}

	@Test
	public void testTransferAmount() throws UserNotFoundException, UserAccountNotFoundException {
		// Given
		when(userAccountTransactionService.transferAmount(1, 50001L, transferRequestDto))
				.thenReturn(transferResponseDto);
		// When
		ResponseEntity<TransferResponseDto> response = userAccountTransactionController.transferAmount(1, 50001L,
				transferRequestDto);

		// Then
		assertEquals(200, response.getBody().getStatusCode());
	}
}
