package prueba;

import java.util.Scanner;

public class FrioCaliente {
	public static void main(String[] args) {
		int numeroAdivinar=(int) (Math.random() * 21);
		int numeroUser;
		int vidas=5;
		int ganar=0;
		do {
			//System.out.println(numeroAdivinar);
			if(numeroAdivinar==0) {
				numeroAdivinar=numeroAdivinar+1;
			}
			//System.out.println(numeroAdivinar);
			System.out.println("Introduce un numero");
			Scanner entrada = new Scanner(System.in);		
			numeroUser=entrada.nextInt();
			if(numeroUser<=(numeroAdivinar+5) && numeroUser>=(numeroAdivinar+3)) {
				System.out.println("Estas tibio mano, manito");
				vidas=vidas-1;
			}else if(numeroUser>(numeroAdivinar+5) && numeroUser<=(numeroAdivinar+10)) {
				System.out.println("Estas frio manito");
				vidas=vidas-1;
			}else if(numeroUser>(numeroAdivinar+10) && numeroUser<=(numeroAdivinar+100000)) {
				System.out.println("Estas congelado manito");
				vidas=vidas-1;
			}else if(numeroUser>numeroAdivinar && numeroUser<=(numeroAdivinar+2)) {
				System.out.println("Estas calientito manito");
				vidas=vidas-1;
			}else if(numeroUser==numeroAdivinar){
				System.out.println("Felicidades ganasteee!!!");
				System.out.println("Eres el nuevo Akinator");
				System.out.println("El numero era: "+numeroAdivinar);
				ganar=1;
			}else if(numeroUser>(numeroAdivinar-3) && numeroUser<numeroAdivinar) {
				System.out.println("Estas calientito manito");
				vidas=vidas-1;
			}else if(numeroUser>=(numeroAdivinar-5) && numeroUser<=(numeroAdivinar-3)) {
				System.out.println("Estas tibio mano, manito");
				vidas=vidas-1;
			}else if(numeroUser>(numeroAdivinar-10) && numeroUser<(numeroAdivinar-5)) {
				System.out.println("Estas frio manito");
				vidas=vidas-1;
			}
			else if(numeroUser<(numeroAdivinar-10) && numeroUser>=(numeroAdivinar-100000)) {
				System.out.println("Estas congelado manito");
				vidas=vidas-1;
			}
		}while(vidas>0 && ganar==0);
		if(vidas==0) {
			System.out.println("");
			System.out.println("Lo sientoo perdiste");
			System.out.println("Fin del juego");
			System.out.println("El numero era: "+numeroAdivinar);
		}
	}
}
