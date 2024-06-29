import java.util.Scanner;
public class PiramideAsteriscos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número de filas para la pirámide: ");
        int filas = sc.nextInt();
        int filaActual = 1;
        while (filaActual <= filas) {
            // Imprime espacios en blanco antes de los asteriscos
            int espacios = filas - filaActual;
            while (espacios > 0) {
                System.out.print(" ");
                espacios--;
            }

            // Imprime asteriscos
            int asteriscos = 2 * filaActual - 1;
            while (asteriscos > 0) {
                System.out.print("*");
                asteriscos--;
            }

            // Cambia de línea para la siguiente fila
            System.out.println();

            filaActual++;
        }
    }
}
