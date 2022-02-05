/*Enunciado:
  * Fazer um programa que leia os valores do peso e da altura de pessoas, enquanto não for digitado o número -1, conte e
  * escreva quantas pessoas estão acima do peso. A condição (peso/(altura²)) <= 25 diz que a pessoa está no peso normal.
  */
import java.util.Locale;
import java.util.Scanner;
import java.io.*;
public class exercicio10 {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));

		Scanner teclado = new Scanner(System.in);
		float altura, peso;
		int contador;
		
		
		System.out.println("Digite o peso e uma altura respectivamente (caso queira parar digite peso como -1): ");
		peso = teclado.nextFloat();
		altura = teclado.nextFloat();
		
		contador = 0;
		while (true) {
		    if (peso/(altura*altura) >= 25)
		    	contador++;
		    
		    peso = teclado.nextFloat();
		    if (peso < 0)
		        break;
		    
		    altura = teclado.nextFloat();
		}
	
		System.out.println("Existe " + contador + " acima do peso");
		teclado.close();
	}

}
