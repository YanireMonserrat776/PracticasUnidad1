package Paquete01;

import java.util.Scanner;

public class Practica09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opc;
		float n;
		double r;
		
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		System.out.println("1.- Pulgadas a centímetros.");
		System.out.println("2.- Pies a centímetros.");
		System.out.println("3.- Pies a pulgadas.");
				
		opc=leer.nextInt();
		
		switch(opc){
		
		case 1:
			System.out.println("Ingrese la cantidad en pulgadas");
			n=leer.nextFloat();
			r=n*2.54;
			System.out.println("La cantidad en centimetros es "+ r );
			break;
			
			
		case 2:
			System.out.println("Ingrese la cantidad en pies");
			n=leer.nextFloat();
			r=n*30.48;
			System.out.println("La cantidad en centímetros "+ r );
			break;
		
			
		case 3:
			System.out.println("Ingrese la cantidad en pies");
			n=leer.nextFloat();
			r=n*12;
			System.out.println("La cantidad en pulgadas es "+ r );
			break;
			
		default:
			System.out.println("Opcion no válida");
			
leer.close();
	}

	}

}
