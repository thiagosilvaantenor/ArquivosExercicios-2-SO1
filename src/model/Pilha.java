package model;

import model.NoPilha;

public class Pilha<T> {
	private NoPilha<T> ultimo = null;

	public void push(T valor) {
		NoPilha<T> novo = new NoPilha<>(valor);
		if (this.ultimo != null) {
			NoPilha<T> buffer = this.ultimo;
			novo.setAnterior(buffer);
		}
		this.ultimo = novo;
	}

	public NoPilha<T> getUltimo() {
		return this.ultimo;
	}

	public NoPilha<T> pop() {
		if (this.ultimo == null) {
			return null;
		}
		NoPilha<T> buffer = this.ultimo;
		this.ultimo = buffer.getAnterior();
		return buffer;
	}

	@Override
	public String toString() {
		if (this.ultimo == null)
			return "[]";
		NoPilha<T> buffer = this.ultimo;
		StringBuilder saida = new StringBuilder("[");
		saida.append(buffer.getValor());
		while (buffer.getAnterior() != null) {
			saida.append(",");
			buffer = buffer.getAnterior();
			saida.append(buffer.getValor());
		}
		saida.append("]");
		return saida.toString();
	}

}
