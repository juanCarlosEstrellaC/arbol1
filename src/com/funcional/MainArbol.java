package com.funcional;

import com.funcional.lista.BinTree;
import com.funcional.lista.Lista;

public class MainArbol {

	public static void main(String[] args) {

		Lista<Integer> lista = Lista.of(1, 2, 3, 4, 5, 6, 7, 8);
		BinTree<Integer> arbol = BinTree.buildTree(lista);
		System.out.println(arbol.size()); // Imprime el número de nodos del árbol
		System.out.println(arbol.toString()); // Imprime la representación en cadena del árbol

		
	}

}
