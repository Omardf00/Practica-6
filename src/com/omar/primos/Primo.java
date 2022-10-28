package com.omar.primos;

public class Primo {
	
	Integer[] primos = {2,3,5,7};
	
	public boolean esPrimo(Integer x) {
		for(Integer primo:primos) {
			if (x%primo==0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	//Pruebas
	
	
	public boolean esPrimo2(Integer x) {
		for(Integer i=0; i < primos.length ; i++) {
			if (x%primos[i]==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean esPrimo3(Integer x) {
		Integer i = 0;
		for(i = primos.length - 1; i >= 0; i--) {
			if (x%primos[i]==0) {
				return false;
			}
		}
		
		return true;
	}

}
