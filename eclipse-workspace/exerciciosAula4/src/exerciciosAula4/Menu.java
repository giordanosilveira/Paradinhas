package exerciciosAula4;

import java.util.Scanner;

public class Menu {

	private ManterAluno opcoes = new ManterAluno();
	public static Scanner teclado = new Scanner(System.in);
	 
	public void inserir(String nome, String email, String grr) {
		this.opcoes.inserirAluno(nome, email, grr);
		//opcoes.imprimirAlunos();
	}
	
	public void remover(String grr) {
		//this.opcoes.imprimirAlunos();
		this.opcoes.removerAluno(grr);
	}
	
	public void salvar() {
		this.opcoes.salvarAluno();
	}
	
	public void recuperar() {
		this.opcoes.recuperarAluno();
		//this.opcoes.imprimirAlunos();
	}
	
	public void verAlunos() {
		this.opcoes.imprimirAlunos();
	}
	
	public static void main(String[] args) {
		/*Menu opcao = new Menu();
		boolean sair = false;
		while (! sair) {
			System.out.println("Aperte '1' para inserir um aluno novo");
			System.out.println("Aperte '2' para remover um aluno");
			System.out.println("Aperte '3' para salvar os alunos em um arquivo");
			System.out.println("Aperte '4' para recuperar esses alunos de um arquivo");
			System.out.println("Aperte '5' para ver todos os alunos do sistema");
			System.out.println("Aperte '0' para sair");
			int opcao_requisitada = teclado.nextInt();
			teclado.nextLine();
			switch (opcao_requisitada) {
			    case 1:
			        
			    case 0:
			    	sair = true;
			    	break;
			    default:
			    	System.out.println("Opção não encontrada");
			    	break;
			}
		}
		teclado.close();*/
	}

}
