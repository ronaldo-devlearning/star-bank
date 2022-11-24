package com.devlearning.bank.domain;

public abstract class Conta implements IConta {

	private Long id;
	private String numero;
	private Double limite;
	private double saldo;
	private boolean ativo;
	
}
