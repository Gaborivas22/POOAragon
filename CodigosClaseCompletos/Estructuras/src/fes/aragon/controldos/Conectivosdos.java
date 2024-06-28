package fes.aragon.controldos;

public class Conectivosdos {
	public static void main(String[] args) {
		int a=1;
		int b=8;
		int c=5;
		if(a>b && a>c && b>c) {
			System.out.println("a"+a +"b"+b + "c"+c);
		}else {
			System.out.println("a"+a + "c"+c + "b"+b);
		}
		if(b>a && b>c && a>c) {
			System.out.println("b"+b +"a"+a + "c"+c);
		}else {
			System.out.println("b"+b + "c"+c + "a"+a);
		}
		if(c>a && c>b && a>b) {
			System.out.println("c"+c +"a"+a + "b"+b);
		}else {
			System.out.println("c"+c + "b"+b + "a"+a);
		}
	}
}
