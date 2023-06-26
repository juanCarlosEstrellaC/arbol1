package com.funcional.lista;

public class BinTreeJJ<T> {
	
    private final T valor;
    private final BinTreeJJ<T> izquierdo;
    private final BinTreeJJ<T> derecho;

    // HOJA:
    public BinTreeJJ(T valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }

    // OTROS
    public BinTreeJJ(T valor, BinTreeJJ<T> izquierdo, BinTreeJJ<T> derecho) {
        this.valor = valor;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public T getValor() {
        return valor;
    }

    public BinTreeJJ<T> getIzquierdo() {
        return izquierdo;
    }

    public BinTreeJJ<T> getDerecho() {
        return derecho;
    }

    @Override
    public String toString() {
        return toStringAux(this);
    }

    private String toStringAux(BinTreeJJ<T> nodo) {
        if (nodo == null) {
            return "null";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(nodo.getValor());
        sb.append(", ");
        sb.append(toStringAux(nodo.getIzquierdo()));
        sb.append(", ");
        sb.append(toStringAux(nodo.getDerecho()));
        sb.append(")");

        return sb.toString();
    }
}
