package atv6;

import java.util.Scanner;

public class atv6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[] A = new int[6];
		int[] B = new int[6];
		
		
		for (int i = 0; i < B.length; i++) {
			System.out.println("Valor: ");
			A[i] = ler.nextInt();		
		}
		for (int i = 0; i < B.length; i++) {
			if(A[i]%2 == 0) {
				B[i] = 1;
			}else {
				B[i] = 0;
			}
		}
		System.out.println("Vetor A: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(A[i]+"-");
		}
		System.out.println("Vetor B: ");
		for (int i = 0; i < B.length; i++) {
			System.out.print(B[i]+"-");
		}
	}

}