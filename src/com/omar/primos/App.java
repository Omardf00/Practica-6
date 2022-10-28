package com.omar.primos;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido a la consulta de números primos");
		System.out.println("En esta app devolveremos los números primos que hay entre 1 y 100");
		
		Primo primo = new Primo();
		Integer i;
		
		for ( i=1; i<=100; i++) {
			
			boolean esPrimo = primo.esPrimo(i);
			
			if (esPrimo) {
				System.out.println(i);
			}
			
		}

	}

}
