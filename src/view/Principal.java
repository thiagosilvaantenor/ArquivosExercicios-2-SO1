package view;

import java.util.Scanner;

import controller.FifaController;
import controller.ListaDeArquivosController;
import model.Lista;
import model.Pilha;

public class Principal {

	public static void main(String[] args) {
		int opc = 9;
		Scanner sc = new Scanner(System.in);
		System.out.println("to rodando");
		try {
			while (opc != 0) {
				System.out.println("Olá, digite o exercicio que deseja executar: \n" + "1 - Exercicio 1 \n"
						+ "2 - Exercicio 2 \n" + "0 - Sair");
				opc = sc.nextInt();
				switch (opc) {
				case 1:
					FifaController fifa = new FifaController();

					Pilha<String> pilha = fifa.empilhaBrasileiros("C:\\TEMP", "data.csv");
					fifa.desmpilhaBonsBrasileiros(pilha);
					Lista<String> lista = fifa.listaRevelacoes("C:\\TEMP", "data.csv");
					fifa.buscaListaBonsJovens(lista);
					break;
				case 2:
					ListaDeArquivosController listaArq = new ListaDeArquivosController();
					System.out.println("Informe o caminho do diretório, utilize duas barras invertidas, ex: C:\\: ");
					String caminho = sc.next();
					listaArq.listaArquivosOrdenados(caminho);
					break;
				case 0:
					System.out.println("Saindo...");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
