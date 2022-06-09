package com.codingdojo.vania;

public class Aplicacion {

	public static void main(String[] args) {
		
		Cuadrado cuadrado = new Cuadrado(10);
		
		Triangulo triangulo = new Triangulo(10,5);
		
		System.out.println("Area cuadrado:" + cuadrado.area()); //del objeto cuadrado obtengo el area
		System.out.println("Area triangulo:"+ triangulo.area());

	}

}
