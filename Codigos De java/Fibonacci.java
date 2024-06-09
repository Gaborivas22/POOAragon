package prueba;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		int numeroUser=0;
		int f=1;
		int x=1;
		System.out.println("Introduce un numero");
		Scanner entrada = new Scanner(System.in);		
		numeroUser=entrada.nextInt();
		System.out.println("0");
		do {
			System.out.println(x);
			f = x + f;
            x = f - x;
		}while(x<=numeroUser);
		
	}

}
