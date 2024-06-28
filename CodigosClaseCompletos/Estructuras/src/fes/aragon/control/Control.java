package fes.aragon.control;

import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Dame un numero: ");
		int valor=entrada.nextInt();
		switch(valor) {
		case 1:
			System.out.println("Valor 1");
			break;
		case 2:
			System.out.println("Valor 2");
			break;
		default:
			System.out.println("Otro valor");
			break;
		}
	}
}
