package sistema_folha_pagamento;

import java.util.ArrayList;

public class DadosEmpregados {
	private static ArrayList<Empregado> empregadosFolha = new ArrayList<Empregado>();
	private static int numeroUnicoEmpregado = 1;
	//se for usar pra saber a quantidade de empregados, lembrar de diminuir -1
	
	void adicionarEmpregado(Empregado empregadoNovo) {
		//empregadoNovo.numeroUnicoFolha = DadosEmpregados.numeroUnicoEmpregado;
		empregadoNovo.setNumeroUnicoFolha(DadosEmpregados.numeroUnicoEmpregado);
		empregadosFolha.add(empregadoNovo);
		DadosEmpregados.numeroUnicoEmpregado++;
	}
	
	void removerEmpregado(Empregado empregadoParaRemover) { //no caso seria o index
		empregadosFolha.remove(empregadoParaRemover);
	}
	
}
