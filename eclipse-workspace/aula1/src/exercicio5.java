/*Enunciado:
  Construa um programa em Java que leia um número inteiro e diga se ele é par ou ímpar*/
import java.util.Scanner;
import java.io.*;
public class exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.println("Digíte um número: ");
		num = teclado.nextInt();
	    
		if (num % 2 == 1)
			System.out.println("O número é ímpar");
		else
			System.out.println("O número é par");

	}

}
