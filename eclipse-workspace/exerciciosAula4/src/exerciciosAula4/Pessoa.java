package exerciciosAula4;

import java.io.Serializable;
import java.util.Scanner;

public class Pessoa implements Serializable{ 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String email;
	
	public Pessoa(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um nome e o email");
		String new_nome = teclado.nextLine();
		String new_email = teclado.nextLine();
		
		Pessoa pessoa = new Pessoa(new_nome, new_email);
		System.out.println(pessoa.getNome() + " " + pessoa.getEmail());
		
		System.out.println("Troque o nome e o email");
		new_nome = teclado.nextLine();
		new_email = teclado.nextLine();
		
		pessoa.setNome(new_nome);
		pessoa.setNome(new_email);
		System.out.println(pessoa.getNome() + " " + pessoa.getEmail());
		
		
	}

}
