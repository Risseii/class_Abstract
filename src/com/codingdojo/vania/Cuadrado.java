package com.codingdojo.vania;

public class Cuadrado extends Figura{
	
	private double longitud;

	public Cuadrado(double longitud) {  //necesito la longitud
		this.longitud = longitud;  //instancia de longitud
	}
	
	public double area() {
		return longitud*longitud;
	}
	

}
