import java.util.Scanner;
public class contavocales {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Ingresa una frase: ");
    String frase = sc.nextLine();
    sc.close();

    frase = frase.toLowerCase(); // Convertir la frase a minúsculas para contar las vocales sin distinción de mayúsculas o minúsculas

    int longitud = frase.length();
    int contadorVocales = 0;
    int i = 0;
    int a =0;

    while (i < longitud) {
        char caracter = frase.charAt(i);
        if (caracter == 'a') {
            a++;
        }
        i++;
    }

    System.out.println("La frase tiene " + a + " vocales a.");
}

}
