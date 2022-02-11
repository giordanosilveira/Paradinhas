/*Enunciado
 * fazer um programa em Java que leia 10 valores de idades de pessoas, calcule e imprima a média e a seguir imprima quais idades estão acima e quais
 * estão abaixo da media*/
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int idades[] = new int[10];
		int num = 0;
        double media_idades = 0;
        
        for (int i = 0; i < 10; i += 1) 
        	idades[i] = teclado.nextInt();
        	
        for (int i = 0; i < 10; i += 1) {
        	media_idades += idades[i];
        }
        
        media_idades = media_idades/10;
        System.out.println("A média é igual á " +media_idades);
        
        for (int i = 0; i < 10; i++) {
        	if (idades[i] <= media_idades)
        		System.out.println("Nota menor que a média: " +idades[i]);
        	else
        		System.out.println("Nota maior que a média " +idades[i]);
        }
        
        teclado.close();
	}

}
