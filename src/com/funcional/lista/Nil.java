package com.funcional.lista;

// Nil = nodo final (sin cabezera ni cola)
public final class Nil<T> implements Lista<T> {

	protected Nil() { // Es un singleton
	} 

	@Override
	public T head() {
		return null;
	}

	@Override
	public Lista<T> tail() {
		return null;
	}

	@Override
	public boolean isEmpty() {
		return true;      
	}
    
	// toString
	@Override
	public String toString() {
		return "NIL";
	}
	
}
