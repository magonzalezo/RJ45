package com.servicio.ejercicio;

public class Calculadora {
	
	public int sumar (int operando_1, int operando_2) {
		return operando_1 + operando_2;
	}
	
	public int restar (int operando_1, int operando_2) {
		return operando_1 - operando_2;
	}
	
	public int multiplicar (int operando_1, int operando_2) {
		return operando_1 * operando_2;
	}
	
	public double dividir (int operando_1, int operando_2) {
		return operando_1 / operando_2;
	}
	
	public double potencia (int pBase, int pExponente) {
		Double base = (double) pBase;
		Double exponente = (double)pExponente;
		return Math.pow(base, exponente);
	}
	
}
