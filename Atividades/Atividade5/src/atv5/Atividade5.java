package atv5;

	import java.util.Scanner;

public class Atividade5 {
		public static void main(String[] args) {
			
			
			float[] nota1 = new float[10];
			float[] nota2 = new float[10];
			
			float[] result = new float [10];
			
			Scanner ler = new Scanner(System.in);
			 
			for(int i = 0; i < 10; i++) {
				System.out.println("Digite a nota 1 do aluno " + (i+1) + ": ");
				nota1[i] = ler.nextFloat();
				System.out.println("Digite a nota 2 do aluno " + (i+1) + ": ");
				nota2[i] = ler.nextFloat();
				System.out.println();
				
				result[i] = (nota1[i] + nota2[i])/2;
				System.out.println("Aluno: " + (i+1) + "  Resultado:" + result[i]);
				
				if (result[i] >= 7) {
					System.out.println("Aprovado");
				}else {
					System.out.println("Reprovado");
				}
				
				System.out.println();
				
			}
			

		}


}
