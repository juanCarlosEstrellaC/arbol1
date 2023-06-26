package com.funcional.lista;

public final class NodoInterno<T> implements ArbolBinario<T> {

    private final T valor;
    private final ArbolBinario<T> izquierdo;
    private final ArbolBinario<T> derecho;

    public NodoInterno(T valor, ArbolBinario<T> izquierdo, ArbolBinario<T> derecho) {
        this.valor = valor;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    @Override
    public T getValor() {
        return valor;
    }

    @Override
    public ArbolBinario<T> getIzquierdo() {
        return izquierdo;
    }

    @Override
    public ArbolBinario<T> getDerecho() {
        return derecho;
    }
    
    @Override
    public boolean esHoja() {
        return false;
    }

    @Override
    public String toString() {
        return "(" + valor + ", " + izquierdo.toString() + ", " + derecho.toString() + ")";
    }
}
