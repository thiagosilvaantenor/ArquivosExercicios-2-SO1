package model;

public class NoLista<T> {
	private T valor;
	private NoLista<T> proximo;
	private NoLista<T> anterior;

	public NoLista(T valor) {
		this.valor = valor;
		this.proximo = null;
		this.anterior = null;
	}

	public T getValor() {
		return valor;
	}
	
	public NoLista<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NoLista<T> anterior) {
		this.anterior = anterior;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public NoLista<T> getProximo() {
		return proximo;
	}

	public void setProximo(NoLista<T> proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return this.valor.toString();
	}

	
}
