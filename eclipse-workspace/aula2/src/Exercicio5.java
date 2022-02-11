/*Enunciado:
 * Construa um programa em java que some duas matriz 3x3 e imprima as duas matrizes e o resultado*/
import java.io.*;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int matriz1[][] = new int[3][3], matriz2[][] = new int[3][3];
		int matriz3[][] = new int[3][3];
		
		
		System.out.println("Escreva a matriz 1 ");
		for (int i = 0; i < 3; i += 1)
			for (int j = 0; j < 3; j += 1) 
				matriz1[i][j] = teclado.nextInt();
			
		System.out.println("Escreva a matriz 2");
		for (int i = 0; i < 3; i += 1)
			for (int j = 0; j < 3; j += 1) 
				matriz2[i][j] = teclado.nextInt();
			
		System.out.println("A soma das matrizes é igual a: ");
		for (int i = 0; i < 3; i += 1) {
			for (int j = 0; j < 3; j += 1) {
			    System.out.print(matriz1[i][j] + matriz2[i][j] + " ");
			}
			System.out.println();
		}
		teclado.close();
		
	}

}
