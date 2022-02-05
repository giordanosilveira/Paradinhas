/*Enunciado:
 * Fazer um programa em JAva que leia as 4 notas de 30 alunos e escreva a maior nota de cada aluno e a maior nota da turma*/
import java.util.Scanner;
import java.io.*;
public class exercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float nota, maior_nota_geral = 0;
		
		for (int aluno = 0; aluno < 4; aluno++) {
			
			float maior_nota_aluno = 0;
			
			System.out.println("Digite as 4 notas do aluno " +aluno);
			for (int i = 0; i < 4; i++) {
				nota = teclado.nextFloat();
				if (maior_nota_aluno < nota)
					maior_nota_aluno = nota;
			}
			System.out.println("A maior nota do aluno " + aluno + " é igual a " +maior_nota_aluno);

			if (maior_nota_geral < maior_nota_aluno)
				maior_nota_geral = maior_nota_aluno;
			
		}
		
       System.out.println("A maior nota geral é igual a " +maior_nota_geral);
       teclado.close();
	}

}
