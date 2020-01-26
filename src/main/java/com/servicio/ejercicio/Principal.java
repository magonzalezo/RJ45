package com.servicio.ejercicio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Principal {
	
	@PostMapping("/suma")
	public String sumar(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		Calculadora calculadora = new Calculadora();
		return "Resultado de la suma: "+calculadora.sumar(num1, num2);
	}
	
	@PostMapping("/resta")
	public String restar(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		Calculadora calculadora = new Calculadora();
		return "Resultado de la resta: "+calculadora.restar(num1, num2);
	}
	
	@PostMapping("/multiplicacion")
	public String multiplicar(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		Calculadora calculadora = new Calculadora();
		return "Resultado de la multiplicacion: "+calculadora.multiplicar(num1, num2);
	}
	
	@PostMapping("/division")
	public String dividir(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		Calculadora calculadora = new Calculadora();
		return "Resultado de la division: "+calculadora.dividir(num1, num2);
	}
	
	@PostMapping("/potencia")
	public String potenciar(@RequestParam("base") int base, @RequestParam("potencia") int potencia) {
		Calculadora calculadora = new Calculadora();
		return "El resultado de la potencia es: "+calculadora.potencia(base,potencia);
	}
	
	@GetMapping("/prueba")
	public String pruebaRetorno(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
		return "Usted envió: "+num1+" y "+num2;
	}
	
	@GetMapping("/")
	public String indice() {
		return "Entro a la calculadora de su sufrimiento";
	}
	
}
