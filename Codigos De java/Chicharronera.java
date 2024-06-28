import java.util.Scanner;
public class gabo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double numA = 0,numB=0,numC=0, resul = -1, x1=0,x2=0;
	    while(resul<0|| numA==0) {
	    	System.out.println("Ingresa el dato A:");
	    	numA = sc.nextInt();
	    	System.out.println("Ingresa el dato B:");
	    	numB = sc.nextInt();
	    	System.out.println("Ingresa el dato C:");
	    	numC = sc.nextInt();
	    	resul= (Math.pow(numB, 2))-(4*numA*numC);
	    	System.out.println(resul);
	    	if(resul<0) {
	    		System.out.println("la raiz no se puede resolver");
	    	}else {
	    		if(numA==0) {
	    			System.out.println("la division no se puede resolver pues A es 0");
	    		}
	    	}
	    }
	    resul=Math.sqrt(resul);
	    x1=(((-1)*numB)+resul)/(2*numA);
	    System.out.println(x1);
	    x2=(((-1)*numB)-resul)/(2*numA);
	    System.out.println(x2);
	}
}
