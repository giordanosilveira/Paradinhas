package exerciciosAula4;

import java.util.Scanner;

public class Main {

	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		int opcao;
		System.out.println("Se for a sua primeira vez executando esse programa, a opção recuperar aluno não irá funcionar.");
		System.out.println("Visto que ela recupera os alunos de um arquivo, entretanto se não houver nenhum arquivo, não tem o que procurar.");
		System.out.println("Dito isso...");
		
		System.out.println("Aperte '1' para inserir um aluno novo");
		System.out.println("Aperte '2' para remover um aluno");
		System.out.println("Aperte '3' para salvar os alunos em um arquivo");
		System.out.println("Aperte '4' para recuperar esses alunos de um arquivo");
		System.out.println("Aperte '5' para ver todos os alunos do sistema");
		System.out.println("Aperte '6' para relembrar as opções");
		System.out.println("Aperte '0' para sair");
		
		opcao = teclado.nextInt();
		teclado.nextLine();
		
		while (opcao != 0) {
			switch(opcao) {
				case 1:
					System.out.println("Você selecionou a opção inserir alunos.");
					System.out.println("Digite o nome, o email e o grr do aluno que você quer inserir.");
					menu.inserir(teclado.nextLine(), teclado.nextLine(), teclado.nextLine());
					System.out.println("Aluno inserido.");
			        break;
			    case 2:
			    	System.out.println("Você selecionou a opção 'remover' que remove um aluno por seu grr.");
					System.out.println("Digite o grr do aluno que você quer remover.");
			    	menu.remover(teclado.nextLine());
			    	System.out.println("Aluno removido");
			    	break;
			    case 3:
			    	System.out.println("Você selecionou a opção 'salvar' que salva os alunos em um arquivo.");
			    	System.out.println("Essa opção sobrescreve o arquivo. Tem certeza que quer contiunar? 'S' para sim; 'N' para não");
			    	String certeza;
			    	certeza = teclado.nextLine();
			    	if (certeza.equals("S") || certeza.equals("s")) {
			    		menu.salvar();
			    		System.out.println("Salvo no arquivo 'alunos.dat' ");
			    	}
			    	System.out.println("Fim operação");
			    	break;
			    case 4:
			    	System.out.println("Você selecionou a opção 'recupera' que recupera os alunos de um arquivo.");
			        menu.recuperar();
			        System.out.println("Recuperados");
			        break;
			    case 5:
			    	System.out.println("Você selecionou a opção 'ver aluno' que imprime todos os alunos do sistema.");
			        menu.verAlunos();
			        break;
			    case 6:
			    	System.out.println("Aperte '1' para inserir um aluno novo");
					System.out.println("Aperte '2' para remover um aluno");
					System.out.println("Aperte '3' para salvar os alunos em um arquivo");
					System.out.println("Aperte '4' para recuperar esses alunos de um arquivo");
					System.out.println("Aperte '5' para ver todos os alunos do sistema");
					System.out.println("Aperte '6' para relembrar as opções");
					System.out.println("Aperte '0' para sair");
			        break;
			    default:
			    	System.out.println("Opção não encontrada");
					break;
					
			}
			opcao = teclado.nextInt();
			teclado.nextLine();
		}
		

	}

}
