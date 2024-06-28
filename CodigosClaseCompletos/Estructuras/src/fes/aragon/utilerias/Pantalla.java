package fes.aragon.utilerias;

public class Pantalla {
	public static void main(String[] args) {
		int[][] ar= {{0,0,0,0,0,0,0,0,0,0,},
				{0,0,0,0,0,0,0,0,0,0,},
				{0,0,0,0,0,0,0,0,0,0,},
				{0,0,0,1,0,1,0,0,0,0,},
				{0,0,0,0,1,0,0,0,0,0,},
				{0,0,0,1,0,1,0,0,0,0,},
				{0,0,0,0,0,0,0,0,0,0,},
				{0,0,0,0,0,0,0,0,0,0,},
				{0,0,0,0,0,0,0,0,0,0,},
				{0,0,0,0,0,0,0,0,0,0,}};
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				if(ar[i][j]== 0) {
					System.out.print("/");	
				}else {
					System.out.print("*");
				}
			}
				System.out.println();
		}
		
	}

}
