package com.principal;

public class Main {

	public static void main(String[] args) {
		Mata mata = new Mata();
		for (int i = 0; i<10; i++) {
		System.out.println( " -Nombre- " + mata.nombre() + " -vida- "+mata.vida() + " -damages- " + mata.damage());
		}

	}

}
