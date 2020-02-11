package com.foreignexchange.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Govindasamy.C
 * @version V1.1
 * @since 11-02-2020
 *
 */
@Setter
@Getter
@Entity
public class Currency {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String currencyCode;
	private String currencyName;
}
