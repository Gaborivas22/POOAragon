import java.util.Scanner;

public class Numeros {
	public static void main(String args[]){  
		int num, num2, numF;	
		System.out.println("Hola");
		System.out.println("Escribe el numero que deseas probar");
		Scanner leer = new Scanner(System.in);
		num=leer.nextInt();
		num2=num-1;
		numF=(num*num)+(num2*num2);
	}
}
