package model;

import model.NoLista;

public class Lista<T> {
	private NoLista<T> inicio = null;
	private NoLista<T> fim = null;
	private int total = 0;

	public NoLista<T> getInicio() {
		return inicio;
	}

	public NoLista<T> getFim() {
		return fim;
	}

	public int getTotal() {
		return total;
	}

	public void append(T valor) {
		NoLista<T> buffer = new NoLista<>(valor);
		if (this.fim == null) {
			this.fim = buffer;
			this.inicio = buffer;
			total++;
		} else {
			NoLista<T> anterior = this.fim;
			anterior.setProximo(buffer);
			buffer.setAnterior(anterior);
			this.fim = buffer;
			total++;
		}

	}

	public NoLista<T> get(int index) throws IllegalArgumentException {
		if (this.inicio == null) {
			throw new IllegalArgumentException("Lista vazia");
		}
		int i = 0;
		NoLista<T> buffer = this.inicio;
		for (i = 0; i < index; i++) {
			if (buffer.getProximo() == null)
				break;
			buffer = buffer.getProximo();
		}
		if (i < index) {
			throw new IllegalArgumentException("O indice informado nao existe");
		}
		return buffer;
	}

	@Override
	public String toString() {

		if (this.inicio == null) {
			return "[]";
		}
		NoLista<T> buffer = this.inicio;
		StringBuilder saida = new StringBuilder("[");
		while (buffer != null) {
			saida.append(buffer);
			saida.append(",");
			buffer = buffer.getProximo();
		}
		return saida.toString();
	}
}
