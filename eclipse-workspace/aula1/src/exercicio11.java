/*Enunciado:
 * Fazer um programa em Java que calcule e imprima a soma dos 10 primeiros multiplos de 3. */
import java.util.Scanner;
import java.io.*;
public class exercicio11 {

	public static void main(String[] args) {
		int i, soma = 0;
		
		for (i = 1; i <= 10; i++) {
			soma += (i*3);
		}
		System.out.println("A soma dos 10 primeiros múltiplos de 3 é igual a " +soma);	
	}

}
