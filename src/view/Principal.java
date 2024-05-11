package view;

import controller.FifaController;
import model.Lista;
import model.Pilha;

public class Principal {

	public static void main(String[] args) {
		FifaController fifa = new FifaController();

		try {
			Pilha<String> pilha = fifa.empilhaBrasileiros("C:\\TEMP", "data.csv");
			fifa.desmpilhaBonsBrasileiros(pilha);
			Lista<String> lista = fifa.listaRevelacoes("C:\\TEMP", "data.csv");
			fifa.buscaListaBonsJovens(lista);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
