package prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class Ahorcado3 {

	public static void main(String[] args) {
		 String [] IMAGENES_AHORCADO = {
				 "          \n" +
				 "          \n" +
				 "          \n" +
				 "          \n" +
				 "          \n" +
				 "          \n" +
				 " =========\n",
				    "  +------+\n" +
				    "  |      |\n" +
				    "         |\n" +
				    "         |\n" +
				    "         |\n" +
				    "         |\n" +
				    "  =========\n",

				    "  +------+\n" +
				    "  |      |\n" +
				    "  O      |\n" +
				    "         |\n" +
				    "         |\n" +
				    "         |\n" +
				    "  =========\n",

				    "  +------+\n" +
				    "  |      |\n" +
				    "  O      |\n" +
				    "  |      |\n" +
				    "         |\n" +
				    "         |\n" +
				    "  =========\n",

				    "  +------+\n" +
				    "  |      |\n" +
				    "  O      |\n" +
				    " /|      |\n" +
				    "         |\n" +
				    "         |\n" +
				    "  =========\n",

				    "  +------+\n" +
				    "  |      |\n" +
				    "  O      |\n" +
				    " /|\\     |\n" +
				    "         |\n" +
				    "         |\n" +
				    "  =========\n",

				    "  +------+\n" +
				    "  |      |\n" +
				    "  O      |\n" +
				    " /|\\     |\n" +
				    " /       |\n" +
				    "         |\n" +
				    "  =========\n",

				    "  +------+\n" +
				    "  |      |\n" +
				    "  O      |\n" +
				    " /|\\     |\n" +
				    " / \\     |\n" +
				    "         |\n" +
				    "  =========\n",
				    };
		ArrayList<String> palabras = new ArrayList<String>();
		palabras.add("colombia");
		palabras.add("argentina");
		palabras.add("brasil");
		palabras.add("espania");
		palabras.add("mexico");
		palabras.add("ecuador");
		palabras.add("marruecos");
		palabras.add("italia");
		palabras.add("rusia");
		palabras.add("chile");
		palabras.add("suiza");
		palabras.add("suecia");
		palabras.add("somalia");
		palabras.add("canada");
		palabras.add("portugal");
		palabras.add("dinamarca");
		palabras.add("guatemala");
		palabras.add("cuba");
		palabras.add("indonesia");
		palabras.add("japon");
		int a2 = (int) (Math.random() * 20);
		int vidas=7;
		int numLetras=0;
		int letrasCorrectas=0;
		int contCorrectas=0;
		
		char letra;
		int contador = 0;
		int y1=0;
		int a=0, b=0, c=0, d=0,e=0,f=0,g=0,h=0,i=0,j=0,k=0,l=0,m=0,n=0,o=0,p=0,q=0,r=0,s=0 ,t=0,u=0,v=0,w=0,x=0,y=0,z=0;
		char x1;
		String cadena = palabras.get(a2);
		Scanner sc = new Scanner(System.in);
		for (int i1 = 0; i1 < cadena.length(); i1++) {
			letra = cadena.charAt(i1);
			numLetras=numLetras+1;
		}
		System.out.println("El juego del Ahorcado");
		System.out.println("Este juego no admite la letra \u00f1, ni mayusculas, en caso de querer usarla por favor escriba ni");
		System.out.println("Por ejemplo Espa\u00f1a se escribe como espania");
		int numLetrasFaltantes= numLetras-letrasCorrectas;
		do {
			do {
				System.out.println("Ingrese una letra");
				x1 = sc.next().charAt(0);
				switch (x1) {
				case 'a':
					a=a+1;
					if(a>=2) {
						System.out.println("Error esta letra A ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'b':
					b=b+1;
					if(b>=2) {
						System.out.println("Error esta letra B ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'c':
					c=c+1;
					if(c>=2) {
						System.out.println("Error esta letra C ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'd':
					d=d+1;
					if(d>=2) {
						System.out.println("Error esta letra D ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'e':
					e=e+1;
					if(e>=2) {
						System.out.println("Error esta letra E ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'f':
					f=f+1;
					if(f>=2) {
						System.out.println("Error esta letra f ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'g':
					g=g+1;
					if(g>=2) {
						System.out.println("Error esta letra G ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'h':
					h=h+1;
					if(h>=2) {
						System.out.println("Error esta letra H ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'i':
					i=i+1;
					if(i>=2) {
						System.out.println("Error esta letra I ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'j':
					j=j+1;
					if(j>=2) {
						System.out.println("Error esta letra J ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'k':
					k=k+1;
					if(k>=2) {
						System.out.println("Error esta letra K ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'l':
					l=l+1;
					if(l>=2) {
						System.out.println("Error esta letra L ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'm':
					m=m+1;
					if(m>=2) {
						System.out.println("Error esta letra M ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'n':
					n=n+1;
					if(n>=2) {
						System.out.println("Error esta letra N ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'o':
					o=o+1;
					if(o>=2) {
						System.out.println("Error esta letra O ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'p':
					p=p+1;
					if(p>=2) {
						System.out.println("Error esta letra P ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'q':
					q=q+1;
					if(q>=2) {
						System.out.println("Error esta letra Q ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'r':
					r=r+1;
					if(r>=2) {
						System.out.println("Error esta letra R ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 's':
					s=s+1;
					if(s>=2) {
						System.out.println("Error esta letra S ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 't':
					t=t+1;
					if(t>=2) {
						System.out.println("Error esta letra T ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'u':
					u=u+1;
					if(u>=2) {
						System.out.println("Error esta letra U ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'v':
					v=v+1;
					if(v>=2) {
						System.out.println("Error esta letra V ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'w':
					w=w+1;
					if(w>=2) {
						System.out.println("Error esta letra W ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'x':
					x=x+1;
					if(x>=2) {
						System.out.println("Error esta letra X ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'y':
					y=y+1;
					if(y>=2) {
						System.out.println("Error esta letra Y ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
				case 'z':
					z=z+1;
					if(z>=2) {
						System.out.println("Error esta letra Z ya la habias usado");
						contador=0;
					}else {
						contador=1;
					}
					break;
					
				default:
					System.out.println("Error introdujiste un dato incorrecto");
					break;
				}
				
			}while(contador<1);
			for (int i1 = 0; i1 < cadena.length(); i1++) {
				letra = cadena.charAt(i1);
				if(letra==x1) {
					letrasCorrectas=letrasCorrectas+1;
				}		
			}
			
			if(letrasCorrectas>0) {
				System.out.println(IMAGENES_AHORCADO[y1]);
				System.out.println("Letra correcta");
				contCorrectas=contCorrectas+letrasCorrectas;
				numLetrasFaltantes=numLetrasFaltantes-letrasCorrectas;
				letrasCorrectas=0;
			}else if(letrasCorrectas<=0) {
				y1=y1+1;
				System.out.println(IMAGENES_AHORCADO[y1]);
				System.out.println("Letra incorrecta");
				letrasCorrectas=0;
				vidas=vidas-1;
			}
			System.out.println("Letras restantes "+numLetrasFaltantes);
			System.out.println("Letras correctas "+contCorrectas);
			System.out.println("Vidas restantes "+vidas);
		}while(vidas>0 && numLetras>contCorrectas);
		if(vidas==0) {
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("Perdiste");
			System.out.println("La palabra era "+cadena);
		}else {
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("Ganaste");
			System.out.println("La palabra era "+cadena);
		}
		
	}
}

