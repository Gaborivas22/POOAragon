package fes.aragon.control;

import java.util.Scanner;

public class ControlCaracter {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Dame una vocal: ");
		char valor=entrada.next().charAt(0);
		switch(valor) {
		case 'a':
			System.out.println("Valor a");
			break;
		case 'e':
			System.out.println("Valor e");
			break;
		default:
			System.out.println("Otro valor");
			break;
		}
	}
}
