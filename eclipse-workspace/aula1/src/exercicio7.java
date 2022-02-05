/*Enunciado:
  Construa um programa em Java que leia três números e diga se ele podem ser os lados de um triângula isóceles, equilátero
  ou escaleno.*/
import java.util.Scanner;
import java.io.*;
public class exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		float num1, num2, num3;
		
		System.out.println("Digite três números: ");
		num1 = teclado.nextFloat();
		num2 = teclado.nextFloat();
		num3 = teclado.nextFloat();
		
		if (num1 == num2 && num1 == num3)
			System.out.println("Os números podem ser um triângulo equilátero");
		else if (num1 == num2 || num1 == num3 || num2 == num3)
			System.out.println("Os número podem ser um triângulo isóceles");
		else
			System.out.println("Os números podem ser um triângulo escaleno");
		
		teclado.close();
	}

}
