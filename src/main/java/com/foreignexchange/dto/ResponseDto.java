package com.foreignexchange.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * ResponseDto class set the values of status code and message.
 * 
 * @author Govindasamy.C
 * @since 11-02-2020
 * @version V1.1
 *
 */
@Setter
@Getter
public class ResponseDto {

	private Integer statusCode;
	private String message;
}
