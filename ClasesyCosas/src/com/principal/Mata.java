package com.principal;
import java.lang.*;
public class Mata {

	String nombre() {
		String nombre = "Mata";
		
		return nombre;
	}
	
	int vida() {
		int vida = 99;
		return vida;
	}
	
	int damage() {
		
		int min_damage = 5;
		int max_damage = 10;
		int damage = (int) (Math.random()*(max_damage-min_damage));
		return damage;
	}
	
}
