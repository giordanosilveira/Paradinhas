/*Enunciado:
  Construa um programa em Java que leia um número e diga se ele é positivo*/
import java.util.Scanner;
//import java.io.*;
public class exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = teclado.nextInt();
	
		if (num > 0)
		    System.out.println("O número é positivo");
		else
			System.out.println("O número é negativo");
	}

}
