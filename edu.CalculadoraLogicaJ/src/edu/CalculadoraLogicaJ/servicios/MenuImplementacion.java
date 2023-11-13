package edu.CalculadoraLogicaJ.servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

public int mostrarMenuYRespuesta(Scanner comunicadoTeclado) {
		
		int respuesta;
		
		System.out.println("#################");
		System.out.println("1. Cerrar");
		System.out.println("2. Igualdad");
		System.out.println("3. Desigualdad");
		System.out.println("Seleccione una opcion");

		respuesta = comunicadoTeclado.nextInt();
		return respuesta;
		
	}
}
