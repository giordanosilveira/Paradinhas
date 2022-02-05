/*Enunciado:
  Fazer um programa em java que leia números inteiros enquanto não for digitado o número -1, e calcule e imprima a soma
  destes números*/
import java.util.Scanner;
import java.io.*;
public class exercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, soma = 0;
		
		num = teclado.nextInt();
		while (num != -1) {
			soma += num;
			num = teclado.nextInt();
		}
		
		System.out.println("A soma é igual a " +soma);
		teclado.close();
	}

}
