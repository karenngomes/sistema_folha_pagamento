package sistema_folha_pagamento;

import java.util.Scanner;

public class Empregado {
	int tipoEmpregado;//informar qual o tipo do empregado
	//1: assalariado, 2: assalariado com comissão, 3: horistas
	String nome;
	String endereco;
	private int numeroUnicoFolha;
	private boolean pertenceSindicato;
	private int numeroUnicoSindicato;
	private int metodoPagamento;
	
	Scanner entrada = new Scanner(System.in);
	
	
	Empregado(String nome, String endereco) {
		//this.tipoEmpregado = tipoEmpregado;
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public void colocarTipoEmpregado() {
		System.out.println("Selecione qual é o tipo do novo empregado");
		System.out.println("[1] Assalariado sem comissão");
		System.out.println("[2] Assalariado com comissão");
		System.out.println("[3] Horista");
		this.tipoEmpregado = entrada.nextInt();
	}
	
	public void metodoDePagamento() {
		//tambem serve quando for mudar
		System.out.printf("Metodo atual: %s\n", 
		this.metodoPagamento != 0 ?Integer.toString(metodoPagamento) : "nenhum");
		
		System.out.println("Informe qual método de pagamento deseja:");
		System.out.println("[1] Cheque pelos correios");
		System.out.println("[2] Cheque em mãos");
		System.out.println("[3] Deposito em conta bancária");
		int metodo = entrada.nextInt();
		this.metodoPagamento = metodo;
	}
	
	public int getNumeroUnicoFolha() {
		return this.numeroUnicoFolha;
	}

	public void setNumeroUnicoFolha(int numeroUnicoFolha) {
		this.numeroUnicoFolha = numeroUnicoFolha;
	}

	public int getNumeroUnicoSindicato() {
		return this.numeroUnicoSindicato;
	}

	public void setNumeroUnicoSindicato(int numeroUnicoSindicato) {
		this.numeroUnicoSindicato = numeroUnicoSindicato;
	}

	public void pertenceAoSindicato() {
		boolean flag = this.pertenceSindicato;
		System.out.printf("Você%spertence ao sindicato", flag ? " " : "não ");
		if(!flag) {
			System.out.println("Deseja pertencer ao Sindicato? [Y/N]");
			String op = entrada.next().toUpperCase();
			if(op.equals("Y"))
				this.pertenceSindicato = true;
		} else {
			System.out.println("Deseja sair do Sindicato? [Y/N]");
			String op = entrada.next().toUpperCase();
			if(op.equals("Y"))
				this.pertenceSindicato = false;
		}
		
		
		//return flag;
	}
	/*
	public int identificacaoSindicato() {
		return this.numeroUnicoSindicato;
	}
	
	public int identificacaoFolha() {
		return this.numeroUnicoFolha;
	}*/
	
	int taxaSindical() {
		if(pertenceSindicato) 
			return 1;
		else
			 return 0;
		
	}
	
}
