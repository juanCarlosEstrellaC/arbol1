package com.funcional;

import com.funcional.lista.Lista;

public class Main {
	public static void main(String[] args) {

		Lista<Integer> miLista = Lista.of(1, 2, 3, 4, 5, 6,  7, 8);  
		System.out.println("miLista: "+ miLista+"\n");
		
		
		
//		var a = miLista.contar1(miLista);
//		System.out.println(a);
//		
//		var b = miLista.contar2(miLista);
//		System.out.println(b);
		
		var c = miLista.contar();
		System.out.println(c);
		
//		Integer raiz = miLista.head();
//		Lista<Integer> izquierdo = miLista.take(3);
//		Lista<Integer> derecho = miLista.drop(3);
//		
//		System.out.println(raiz);
//		System.out.println(izquierdo);
//		System.out.println(derecho);

		
//		var listaRem2 = miLista.remove(3);
//		System.out.println(listaRem2);
//
//		
//		// JUEVES, 8 JUN:
////		Lista<Integer> miLista = Lista.of(2, 3, 7, 4, 8);  
////		Lista<Integer> miLista2 = Lista.of(6,9); 
////
		System.out.print("Mi Drop: ");
		var listaDrop = miLista.drop(9);
		System.out.println(listaDrop);
////
//		System.out.print("Profe Drop: ");
		
//		var listaDrop2 = miLista.drop2(2);
//		System.out.println(listaDrop2);
////		
//		System.out.print("Drop while: ");
//		var listaWhile = miLista.dropWhile(p -> p%2 == 0);
//		System.out.println(listaWhile);
////		
////		System.out.print("Concat: ");
////		var listaConcat = miLista.concat(miLista2);
////		System.out.println(listaConcat);
////		
//		System.out.print("Take: ");
//		var listaTake = miLista.take(2);
//		System.out.println(listaTake);
////		
////		System.out.print("Take2: ");
////		var listaTake2 = miLista.take2(-99);
////		System.out.println(listaTake2);
////		
////		System.out.print("Take while: ");
////		var listaTakeWhile = miLista.takeWhile(p -> p%2 == 0);
////		System.out.println(listaTakeWhile);
//		
//		// VIERNES, 9 JUN:
////		Lista<Integer> miLista = Lista.of(2, 3, 7, 4, 8);  
//		System.out.print("Sum: ");
//		Integer s = Lista.sumaStatic(miLista);
//		System.out.println(s);
//		
//		
//		// SÁBADO, 10 JUN
////		Lista<Integer> miLista = Lista.of(2, 3, 7, 4, 8);  
////		Lista<Integer> miLista2 = Lista.of(6,9); 
//////		Lista<Integer> miLista = Lista.of(9);  
////
////		
//		System.out.print("Max: ");
//		var listaMax = Lista.max(miLista);
//		System.out.println(listaMax);


	}
}
