package com.funcional.lista;

public final class BinTree<T> implements ArbolBinario<T> {

    private final ArbolBinario<T> arbol;

    public BinTree(ArbolBinario<T> arbol) {
        this.arbol = arbol;
    }


    @Override
    public T getValor() {
        return arbol.getValor();
    }

    @Override
    public ArbolBinario<T> getIzquierdo() {
        return arbol.getIzquierdo();
    }

    @Override
    public ArbolBinario<T> getDerecho() {
        return arbol.getDerecho();
    }
    
    @Override
    public boolean esHoja() {
        return arbol.esHoja();
    }

    @Override
    public String toString() {
        return arbol.toString();
    }

    public int size() {
        return size(arbol);
    }

    private int size(ArbolBinario<T> arbol) {
        if (arbol.esHoja()) {
            return 1;
        } else {
            return 1 + size(arbol.getIzquierdo()) + size(arbol.getDerecho());
        }
    }

    public static <T> BinTree<T> buildTree(Lista<T> miLista) {
        if (miLista.isEmpty()) {
            return new BinTree<>(new NodoHoja<>());
        } else {
            T valor = miLista.head();
            Lista<T> izquierdo = miLista.tail().take(miLista.contar()/2);
            Lista<T> derecho = miLista.tail().drop(miLista.contar()/2);
            return new BinTree<>(new NodoInterno<>(valor, buildTree(izquierdo), buildTree(derecho)));
        }
    }
}
