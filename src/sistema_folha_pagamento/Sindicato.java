package sistema_folha_pagamento;

import java.util.ArrayList;

public class Sindicato {
	private static ArrayList<Empregado> empregadosAfiliados = new ArrayList<Empregado>();
	private static int numeroUnicoNoSindicato = 1;
	//se for usar pra saber a quantidade de empregadosdo sindicato, lembrar de diminuir -1
	
	void adicionarEmpregadoSindicato(Empregado empregadoNovoSindicato) {
		//empregadoNovoSindicato.numeroUnicoSindicato = Sindicato.numeroUnicoNoSindicato;
		empregadoNovoSindicato.setNumeroUnicoSindicato(Sindicato.numeroUnicoNoSindicato);
		empregadosAfiliados.add(empregadoNovoSindicato);
		Sindicato.numeroUnicoNoSindicato++;
	}
}
