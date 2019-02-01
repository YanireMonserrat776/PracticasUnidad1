package Paquete01;

import java.util.Scanner;

public class Practica06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, residuo = 0;
		Scanner leer = new Scanner (System.in);
		System.out.println("Ingrese por favor un numero entero: ");
		n = leer.nextInt();
		String resultado = "";
		
		residuo = (n % 2);
		
		resultado = (residuo == 0) ? "par" : "non";
		System.out.println("El numero " + n + " es " + resultado);
		
		/*if (residuo == 0)
			System.out.println("El numero " + n + " es par");
		else 
			System.out.println("El numero " + n + " es non, ");*/
		leer.close();
	

	}

}
