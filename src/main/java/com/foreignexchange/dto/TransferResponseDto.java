package com.foreignexchange.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.foreignexchange.common.ForeignExchangeEnum.TransferStatus;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TransferResponseDto extends ResponseDto{

	private Integer transRefNo;
	@Enumerated(EnumType.STRING)
	private TransferStatus status;
}
