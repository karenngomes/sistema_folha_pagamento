package sistema_folha_pagamento;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int flag = 1;
		//colocar empregados padroes
		DadosEmpregados empregadosNoSistema = new DadosEmpregados();
		
		do {
			System.out.println("Sistema de Folha de Pagamento");
			System.out.println("- Digite a opção desejada -");
			System.out.println("[1] Cadastrar novo empregado");
			System.out.println("[2] Atualizar dados de um empregado");
			System.out.println("[3] Remover empregado");
			System.out.println("[4] Lançar um Cartão de Ponto");
			System.out.println("[5] Lançar um Resultado Venda");
			System.out.println("[6] Lançar uma taxa de serviço");
			System.out.println("[7] Rodar a folha de pagamento para hoje");
			System.out.println("[8] Undo/redo");
			System.out.println("[9] Agenda de Pagamento");
			System.out.println("[9] Criação de Novas Agendas de Pagamento");
			System.out.println("[0] Sair");
			
			int op = entrada.nextInt();
			flag = op;
			
			switch(op) {
			case 1:
				System.out.println("Cadastrando Novo Empregado");
				System.out.print("Digite o nome do empregado: ");
				String nome = entrada.next().toUpperCase();
				System.out.print("Digite o endereço do empregado: ");
				String endereco = entrada.next().toUpperCase();
				Empregado novoEmpregado = new Empregado(nome, endereco);
				novoEmpregado.colocarTipoEmpregado();
				novoEmpregado.metodoDePagamento();
				empregadosNoSistema.adicionarEmpregado(novoEmpregado);
				System.out.print("Aperte 0 para voltar: ");
				int volte = entrada.nextInt();
				break;
					
			case 2:
				//digitar qual quer remover, pegar o index dele no empregadosNoSistema
				break;
			case 3:

				break;
			case 4:
				break;
			case 5:

				break;
			default:
				break;
			}
		} while(flag != 0);

			

		
		entrada.close();
	}

}
