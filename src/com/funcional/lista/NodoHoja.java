package com.funcional.lista;

public final class NodoHoja<T> implements ArbolBinario<T> {

    public NodoHoja() { //protected?
    }


    @Override
    public T getValor() {
        return null;
    }

    @Override
    public ArbolBinario<T> getIzquierdo() {
        return null;
    }

    @Override
    public ArbolBinario<T> getDerecho() {
        return null;
    }

    @Override
    public boolean esHoja() {
        return true;
    }
    
    @Override
    public String toString() {
        return "HOJA";
    }
}
