package sistema_folha_pagamento;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	//lembrar de checar se data é valida,  dadas duas datas (antes ou depois dela)

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public String dataFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}
