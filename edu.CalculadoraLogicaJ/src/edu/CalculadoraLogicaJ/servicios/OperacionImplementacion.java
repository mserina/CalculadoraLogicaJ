package edu.CalculadoraLogicaJ.servicios;

import java.util.Scanner;

public class OperacionImplementacion implements OperacionInterfaz {
	
private String DarString (int condicionIfPeticion) {
		
		Scanner comunicacionTeclado = new Scanner(System.in);
		String expresion;
		
		if (condicionIfPeticion == 0) {
			System.out.println("Introduzca primera expresion");
		}
		else {
			System.out.println("Introduzca segunda expresion");
		}
		
		expresion = comunicacionTeclado.next();
		return expresion;
	}
	
	public void igualdad () {
		 
		
		 String expresion1 = DarString(0);
		 String expresion2 = DarString(1);
		 System.out.println(expresion1.equals(expresion2));
	}
	
	public void desigualdad() {
		
		
		String expresion1 = DarString(0);
		String expresion2 = DarString(1);
		System.out.println(!expresion1.equals(expresion2));
		}

}
