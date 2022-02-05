/*Enunciado:
  Construa um programa em Java que leia um número x, calcule e escreva o valor da função f(x), dada por:
  0<=x<5, f(x) = x
  5<=x<10, f(x) = 2x+1
  x>=10, f(x) = x-3*/
import java.util.Scanner;
import java.io.*;
public class exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número: ");
		num = teclado.nextInt();
		
		if (num >= 0 && num < 5)
		    System.out.println(num);
		else if (num >= 5 && num < 10)
			System.out.println(2*num + 1);
		else if (num >= 10)
			System.out.println(num - 3);
		else
			System.out.println("Número inválido");
		
		teclado.close();

	}

}
