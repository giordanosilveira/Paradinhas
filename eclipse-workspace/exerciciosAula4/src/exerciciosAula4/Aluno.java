package exerciciosAula4;

import java.util.Scanner;

public class Aluno extends Pessoa {
    
	private String grr;
	
	public Aluno(String nome, String email, String grr) {
		super(nome, email);
		this.grr = grr;
	}
	
	public String getGrr() {
		return this.grr;
	}
	
	public void setGrr(String grr) {
		this.grr = grr;
	}
	
    
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome, email, grr;
		
		System.out.println("Leia o nome, o email e o grr do aluno, respectivamente. ");
		nome = teclado.nextLine();
		email = teclado.nextLine();
		grr = teclado.nextLine();
		
		Aluno al = new Aluno(nome, email, grr);
		System.out.println(nome + " " + email + " " + grr);
        
		System.out.println("Troque o nome, o email e o grr: ");
		nome = teclado.nextLine();
		email = teclado.nextLine();
		grr = teclado.nextLine();
		al.setNome(nome);
		al.setEmail(email);
		al.setGrr(grr);
		
		System.out.println(nome + " " + email + " " + grr);
		
		
		
	}

}
