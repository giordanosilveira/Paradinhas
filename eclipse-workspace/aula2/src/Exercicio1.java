/*Enunciado:
 * fazer um programa que execute um sorteio entre 5 pessoas usando o método
 * int sorteio = (int) (Math.random() * 5) e imprima o nome do vencedor*/

public class Exercicio1 {

	public static void main(String[] args) {
		
		int sorteio = (int)(Math.random()*5);
		System.out.println("O número sorteado foi " + sorteio);
		switch (sorteio) {
		    case 0: System.out.println("O Vencedor é o Giordano Henrique Silveira"); break;
		    case 1: System.out.println("O Vencedor é o Jorge"); break;
		    case 2: System.out.println("A Vencedora é a Paula"); break;
		    case 3: System.out.println("A Vencedora é a Vera"); break;
		    case 4: System.out.println("O Vencedo é o Carlinhos"); break;
		    default: System.out.println("Não teve nenhum vencedor ");
		}
		

	}

}
