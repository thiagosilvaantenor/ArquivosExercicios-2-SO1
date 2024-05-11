package model;

public class NoPilha<T> {
	private T valor;
	private NoPilha<T> anterior;

	public NoPilha(T valor) {
		this.valor = valor;
		this.anterior = null;
	}

	public NoPilha(T valor, NoPilha<T> anterior) {
		this.valor = valor;
		this.anterior = anterior;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public NoPilha<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NoPilha<T> anterior) {
		this.anterior = anterior;
	}

	@Override
	public String toString() {
		return this.valor.toString();
	}

}
