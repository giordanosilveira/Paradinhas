/*Enunciado;
  Fazer um programa em Java que leia um número inteiro e calcule e imprima a tabuada deste número de 1 a 10.*/
import java.util.Scanner;
import java.io.*;		
public class exercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, i;
		
		System.out.println("Digite um número: ");
		num = teclado.nextInt();
		
		for (i = 0; i < 10; i++)
			System.out.println((i + 1)*num);
		
		teclado.close();
		
	}

}
