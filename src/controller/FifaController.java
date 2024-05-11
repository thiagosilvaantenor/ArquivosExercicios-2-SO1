package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import model.Lista;
import model.NoLista;
import model.NoPilha;
import model.Pilha;

public class FifaController implements IFifaController {

	@Override
	public Pilha<String> empilhaBrasileiros(String caminho, String nome) throws IOException {
		Pilha<String> pilha = new Pilha<>();

		File arq = new File(caminho, nome);
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();

			linha = buffer.readLine();
			while (buffer.readLine() != null) {
				if (linha.contains("Brazil")) {
					pilha.push(linha);
				}
				linha = buffer.readLine();
			}

			fluxo.close();
			leitor.close();
			buffer.close();
			System.out.println("\n //Jogadores brasileiros empilhados// \n");
			return pilha;

		} else {
			throw new IOException("Arquivo invalido");
		}

	}

	@Override
	public void desmpilhaBonsBrasileiros(Pilha<String> pilha) throws IOException {
		if (pilha.getUltimo() == null)
			throw new IllegalArgumentException("Erro pilha vazia");

		NoPilha<String> item = pilha.getUltimo();

		while (item != null) {
			String[] linhas = item.getValor().split(",");
			int overall = Integer.parseInt(linhas[7]);
			if (overall > 80) {
				pilha.pop();
				System.out.println(linhas[2] + ", Overall: " + overall);
			}
			item = item.getAnterior();
		}
		System.out.println("\n //Jogadores brasileiros desempilhados// \n");
	}

	@Override
	public Lista<String> listaRevelacoes(String caminho, String nome) throws IOException {
		Lista<String> lista = new Lista<>();
		File arq = new File(caminho, nome);

		if (arq.exists() && arq.isFile()) {
			// verifica se o valor da coluna Age é menor ou igual a 20
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			buffer.readLine();
			String linha = buffer.readLine();

			while (linha != null) {
				String[] linhas = linha.split(",");
				int age = (int) Integer.parseInt(linhas[3]);
				if (age <= 20) {
					lista.append(linha);
				}
				linha = buffer.readLine();
			}
			fluxo.close();
			leitor.close();
			buffer.close();
			
			System.out.println("\n  //Lista com os jogadores jovens criados// \n");
			
			return lista;
		} else {
			throw new IOException("Arquivo invalido");
		}
	}

	@Override
	public void buscaListaBonsJovens(Lista<String> lista) throws IOException {
		NoLista<String> buffer = lista.getFim();
		
		while (buffer.getAnterior() != null) {
			StringBuilder saida = new StringBuilder();
			String[] linha = buffer.getValor().split(",");
			int overall = Integer.parseInt(linha[7]);
			int age = Integer.parseInt(linha[3]);
			if (overall > 80 && age <= 20) {
				saida.append("Nome: " + linha[2]);
				saida.append(", Idade: " + age);
				saida.append(", Overall: " + overall);
				System.out.println(saida.toString());
			}
			buffer = buffer.getAnterior();
		}
		
		System.out.println("\n  //Todos os jogadores jovens bons foram mostrados// \n");

	}

}
