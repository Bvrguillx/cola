
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
		// Añadirá el elemento al array. Evidentemente
		// habrá que hacer una reserva de memoria para
		// añadir un elemento más. Lo añadirá al final de la
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
		// Eliminará del array el elemento. Evidentemente
		// habrá que redimensionar el array al tamaño real.
	}

	public T pop() {
		return null;
		// Eliminará del array el siguiente elemento de la
		// cola. Evidentemente habrá que redimensionar el
		// array al tamaño real.
	}

	public void clear() {
		// Eliminará del array todos los elementos y
		// dejará el array de tamaño 0.
		elementos = (T[]) new Object[0]; // Me obliga a realizar el cast
	}

	public boolean contains() {
		// Devuelve true si el elemento está en la
		// colección utilizando el equals de la clase T.
		for (int indice = 0; indice < elementos.length; indice++) {
			if (elementos[indice].equals(elementos))
				return true;
		}
		return false;
	}

	public boolean isEmpty() {
		// Devuelve true si el array está vacío.
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
		// Devuelve el tamaño de la cola.
	}

}
