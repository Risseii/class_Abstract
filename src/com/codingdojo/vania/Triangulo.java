package com.codingdojo.vania;

public class Triangulo extends Figura{
	
	private double base;
	private double altura;
	
	//constructor
	public Triangulo(double base, double altura) {
		//super();
		this.base = base;
		this.altura = altura;
	}
	
	//method area
	public double area() {
		return (base*altura)/2;
	}
	
	

}
