package edu.CalculadoraLogicaJ.controladores;

import java.util.Scanner;
import edu.CalculadoraLogicaJ.servicios.MenuImplementacion;
import edu.CalculadoraLogicaJ.servicios.MenuInterfaz;
import edu.CalculadoraLogicaJ.servicios.OperacionImplementacion;
import edu.CalculadoraLogicaJ.servicios.OperacionInterfaz;

public class Inicio{
	
	public static void main (String[] args) {
		
		//Creamos las variables
		Scanner comunicadoTecladoMenu = new Scanner (System.in);
		boolean cerrarMenu = false;	
		int opcion;
		
		//Creamos los objetos
		MenuInterfaz menuObjeto = new MenuImplementacion();
		OperacionInterfaz op = new OperacionImplementacion();
		
		
		while (!cerrarMenu) {
			
			opcion = menuObjeto.mostrarMenuYRespuesta(comunicadoTecladoMenu);
			
			switch(opcion) {
			case 1:
				cerrarMenu = true;
				break;
			case 2:
				System.out.println("Ha seleccionado la opción igualdad");
				 op.igualdad();
				break;
			case 3: 
				System.out.println("Ha seleccionado la opción desigualdad");
				 op.desigualdad();
				break;
			}

		}
		
	}
}

