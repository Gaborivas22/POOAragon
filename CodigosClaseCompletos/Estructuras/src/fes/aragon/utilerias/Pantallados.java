package fes.aragon.utilerias;

public class Pantallados {
	public static void main(String[] args) {
		int[][] ar= {{13,0,0,0,0,0,0,0,14,},
				{0,11,0,0,0,0,0,12,0,},
				{0,0,9,0,0,0,10,0,0,},
				{0,0,0,7,0,8,0,0,0,},
				{18,17,16,15,6,15,16,17,18,},
				{0,0,0,8,5,7,0,0,0,},
				{0,0,10,0,4,0,9,0,0,},
				{0,12,0,0,3,0,0,11,0,},
				{14,0,0,0,2,0,0,0,13,}};
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				if(ar[i][j]== 1){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();		
		}
		System.out.println();
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				if(ar[i][j]==2) {
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				if(ar[i][j]==3) {
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				if(ar[i][j]==4) {
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				if(ar[i][j]==5) {
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				if(ar[i][j]==6) {
					System.out.print("*");	
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				if(ar[i][j]==7) {
					System.out.print((char)92);	
				}else if(ar[i][j]==8){
					System.out.print("/");
				}else if(ar[i][j]==6) {
					System.out.print("*");
				}else if(ar[i][j]==15) {
					System.out.print("-");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				if(ar[i][j]==7||ar[i][j]==9) {
					System.out.print((char)92);	
				}else if(ar[i][j]==8||ar[i][j]==10){
					System.out.print("/");
				}else if(ar[i][j]==15||ar[i][j]==16) {
					System.out.print("-");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				if(ar[i][j]==9||ar[i][j]==11) {
					System.out.print((char)92);	
				}else if(ar[i][j]==10||ar[i][j]==12){
					System.out.print("/");
				}else if(ar[i][j]==16||ar[i][j]==17) {
					System.out.print("-");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i<ar.length;i++) {
			for(int j = 0; j<ar[i].length;j++) {
				if(ar[i][j]==11||ar[i][j]==13) {
					System.out.print((char)92);	
				}else if(ar[i][j]==12||ar[i][j]==14){
					System.out.print("/");
				}else if(ar[i][j]==17||ar[i][j]==18) {
					System.out.print("-");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
