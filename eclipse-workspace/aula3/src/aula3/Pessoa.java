package aula3;

import java.io.IOException;

public class Pessoa {
    
	String nome;
	String endereco;
	String telefone;
	String email;
	
	public static void main(String[] args) throws IOException {
		Leitor leitor = new Leitor();
		for (int i = 0; i < 4; i++) {
		    Pessoa pessoa = new Pessoa();
		    System.out.println("Escreva o nome, o endereço, o email e o telefone da pessoa:...");
		    pessoa.nome = leitor.leString();
			pessoa.endereco = leitor.leString();
			pessoa.email = leitor.leString();
			pessoa.telefone = leitor.leString();
			
			System.out.println(pessoa.nome);
			System.out.println(pessoa.email);
			System.out.println(pessoa.endereco);
			System.out.println(pessoa.telefone);
		}

	}

}
