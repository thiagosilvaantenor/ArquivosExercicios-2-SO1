package controller;

import java.io.File;
import java.io.IOException;

public class ListaDeArquivosController {

	public void listaArquivosOrdenados(String caminho) throws IOException {
		
		File diretorio = new File(caminho);

		if (diretorio.exists() && diretorio.isDirectory()) {

			File[] arquivos = diretorio.listFiles();
			File aux;
			//Ordena vetor de arquivos
			ordenarArquivos(arquivos);
			//listaArquivos
			for(File arquivo: arquivos) {
				System.out.println(arquivo);
			}
		}
		else {
			throw new IOException("Diretorio invalido");
		}
	}
	
	private void ordenarArquivos(File[] arquivos) {
		File aux;
		for (int i = 0; i < arquivos.length - 1; i++) {
			for (int j = 0; j < arquivos.length - 1; j++) {
				// file.length retorna em bytes, 1 MB = ((bytes / 1024) / 1024)
				double tamanhoI = ((arquivos[i].length() / 1024) / 1024);
				double tamanhoJ = ((arquivos[i + 1].length() / 1024) / 1024);
				if (tamanhoI > tamanhoJ) {
					aux = arquivos[i+1];
					arquivos[i+1] = arquivos[i];
					arquivos[i] = aux;
				}
			}
		}
	}

}
