package Paquete01;

import java.util.Scanner;

public class Practica12A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int c=1, c1=0, c2=0, nv;
		double v;
		System.out.println("�Cu�ntas ventas registrar�?");
		nv=leer.nextInt();
		while (c<=nv){
		System.out.println("Venta " + c);
		v = leer.nextInt();
		c++;
		if (v>=0 && v<=200){
			c1++;
		}
		if (v>200 && v<400){
			c2++;
		}
		}
		System.out.println("El total de ventas mayor a 0 y menor o igual a 200, es de: " + c1);
		System.out.println("El total de ventas mayor a 200 y menor a 400, es de: " + c2);
		}
		
	}


