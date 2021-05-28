package com.project.walletApp.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class transection_tabel {
	private Date date;
	private int AccountFrom;
	private int AccountTo;
	private double Amount;
}
