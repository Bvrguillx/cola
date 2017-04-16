
public class ColitaColita<T> {

	@SuppressWarnings("unused")
	private T[] elementos;

	// CONSTRUCTOR VACIO

	@SuppressWarnings("unchecked")
	public ColitaColita() {
		// Reservara memoria para un array de 0 T elemento.
		this.elementos = (T[]) new Object[0];
	}

	// METODOS

	@SuppressWarnings("unchecked")
	public void push(T element) {
		// A�adir� el elemento al array. Evidentemente
		// habr� que hacer una reserva de memoria para
		// a�adir un elemento m�s. Lo a�adir� al final de la
		// cola.
		T[] arrayAuxiliar = (T[]) new Object[elementos.length + 1]; // AQUI ME
																	// OBLIGA
																	// HACERLE
																	// EL CAST Y
																	// NO SE
																	// PORQUE
		for (int index = 0; index < elementos.length; index++) {
			arrayAuxiliar[index] = elementos[index];
		}
		arrayAuxiliar[arrayAuxiliar.length - 1] = (T) element;
		elementos = arrayAuxiliar;
	}

	public void remove(T element) {
		// Eliminar� del array el elemento. Evidentemente
		// habr� que redimensionar el array al tama�o real.
	}

	public T pop() {
		return null;
		// Eliminar� del array el siguiente elemento de la
		// cola. Evidentemente habr� que redimensionar el
		// array al tama�o real.
	}

	public void clear() {
		// Eliminar� del array todos los elementos y
		// dejar� el array de tama�o 0.
		elementos = (T[]) new Object[0]; // Me obliga a realizar el cast
	}

	public boolean contains() {
		// Devuelve true si el elemento est� en la
		// colecci�n utilizando el equals de la clase T.
		for (int indice = 0; indice < elementos.length; indice++) {
			if (elementos[indice].equals(elementos))
				return true;
		}
		return false;
	}

	public boolean isEmpty() {
		// Devuelve true si el array est� vac�o.
		if (elementos == null) {
			return true;
		}
		if (elementos.length == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return elementos.length;
		// Devuelve el tama�o de la cola.
	}

}
