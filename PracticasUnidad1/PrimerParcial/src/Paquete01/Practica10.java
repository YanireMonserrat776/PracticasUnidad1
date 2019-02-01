package Paquete01;

import java.util.Scanner;

public class Practica10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1, n2, n3 ;
		double suma, total;
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Ingrese precio de tres productos: ");
		n1 = leer.nextFloat();
		n2 = leer.nextFloat();
		n3 = leer.nextFloat();
		suma=n1+n2+n3;
		
		if (suma>=1500)
		{
			total=suma*1.11;
			
		}
		else 
		{
			total=suma*1.10;
			
		}
			
		
		System.out.println("El incremento del total es: : "+total);
		
		
		
		
		leer.close();
	}

}
