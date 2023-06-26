package com.funcional.lista;

public sealed interface ArbolBinario<T> permits NodoHoja, NodoInterno, BinTree<T> {

    T getValor();

    ArbolBinario<T> getIzquierdo();

    ArbolBinario<T> getDerecho();
    
    boolean esHoja();

    String toString();
}
