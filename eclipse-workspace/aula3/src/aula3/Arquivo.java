/*Enunciado:
 * Usando a classe Arquivo e o método public void gravar(String frase, String nomeArquivo), construa um programa que leia os dados de 4
 * pessoas e grave em um arquivo texto*/
package aula3;

import java.io.FileWriter;
import java.io.IOException;

public class Arquivo {
    
	private FileWriter escritor;
	
	
	public void setEscritor(String nome_arquivo) throws IOException {
		this.escritor = new FileWriter(nome_arquivo);
	}
	
	public void gravar(String frase, String nomeArquivo) throws IOException {
		
		this.setEscritor(nomeArquivo);
		try {
			this.escritor.write(frase);
			this.escritor.write("\n");
		}
		catch (IOException e){
			System.out.println("An error occured. ");
			e.printStackTrace();
		}
	}
	
	public void fecharEscritor() throws IOException {
		this.escritor.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		Leitor leitor = new Leitor();
		Arquivo arq = new Arquivo();
		
		System.out.println("Nome do arquivo:...");
		String nome_arquivo = leitor.leString();
		
		Pessoa pessoa = new Pessoa();
	    System.out.println("Escreva o nome, o endereço, o email e o telefone da pessoa:...");
	    pessoa.nome = leitor.leString();
		pessoa.endereco = leitor.leString();
		pessoa.email = leitor.leString();
		pessoa.telefone = leitor.leString();
		String frase = pessoa.nome + "," + pessoa.endereco + "," + pessoa.email + "," + pessoa.telefone;
		
		for (int i = 0; i < 3; i++) {
		    pessoa = new Pessoa();
		    System.out.println("Escreva o nome, o endereço, o email e o telefone da pessoa:...");
		    pessoa.nome = leitor.leString();
			pessoa.endereco = leitor.leString();
			pessoa.email = leitor.leString();
			pessoa.telefone = leitor.leString();
			
			frase = frase.concat("\n");
			frase = frase.concat(pessoa.nome + "," + pessoa.endereco + "," + pessoa.email + "," + pessoa.telefone);
		}
		arq.gravar(frase, nome_arquivo);
		arq.fecharEscritor();
		
	}

}
