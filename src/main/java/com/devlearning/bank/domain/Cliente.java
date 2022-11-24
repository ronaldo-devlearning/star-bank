package com.devlearning.bank.domain;

import java.util.HashSet;
import java.util.Set;

public class Cliente {

	private Long id;
	private String nome;
	private Endereco endereco;
	private Set<String> telefones = new HashSet<>(); 
	
}
