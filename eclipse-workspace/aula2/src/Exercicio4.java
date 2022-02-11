/*Enunciado:
 * Construa um programa que leia 10 nome e a seguir guarde-os em um array e leia um nome e verifique se ele faz parte da lista*/
import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String nomes[] = new String[10];
		String nome;
		
		System.out.println("Escreva os nomes ");
		for (int i = 0; i < 10; i += 1) {
			nomes[i] = teclado.nextLine();
		}
		
		System.out.println("Escreva o nome que você quer procurar: ");
		nome = teclado.next();
		
		for (int i = 0; i < 10; i += 1) {
			if (nomes[i].equals(nome)) {
				System.out.println("O nome " +nome+ " foi encontrado na posição " +i+ " do vetor");
			}
		}
		

	}

}
