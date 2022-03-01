package exerciciosAula4;

import java.util.Scanner;
import java.util.Vector;

public class ManterAluno {
    
	private Vector<Aluno> alunos = new Vector<Aluno>();
	
	public void setVetor(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void setVetor(Vector<Aluno> vetor) {
		this.alunos = vetor;
	}
	
	public Vector<Aluno> getVetor(){
		return this.alunos;
	}
	
	public void inserirAluno(String nome, String email, String grr) {
		Aluno aluno = new Aluno(nome, email, grr);
		this.setVetor(aluno);
	}
	
	public void removerAluno(String grr) {
		Vector<Aluno> lista_aluno = this.getVetor();
		int remover = -1;
		for (int i = 0; i < lista_aluno.size(); i++) {
			if (lista_aluno.get(i).getGrr().equals(grr)) {
				remover = i;
				break;
			}
		}
		try {
		    lista_aluno.remove(remover);
		}
		catch(IndexOutOfBoundsException ioobex) {
			System.out.println("Aluno não encontrado");
		}
	}
	
	public void salvarAluno() {
		Arquivo arq = new Arquivo();
		arq.gravaAluno(this.getVetor());
	}
	
	public void recuperarAluno() {
		Arquivo arq = new Arquivo();
		Vector<Aluno> alunos = arq.leAluno();
		this.setVetor(alunos);
	}
	
	public void imprimirAlunos() {
		for(int i = 0; i < this.alunos.size(); i++) {
			System.out.println(this.alunos.get(i).getNome() + " " + this.alunos.get(i).getEmail() + " " + this.alunos.get(i).getGrr());
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ManterAluno manter_aluno = new ManterAluno();
		
		System.out.println("Instanciando objetos alunos: ");
		Aluno aluno1 = new Aluno("Giordano", "giordano@gmail.com", "75153595");
		Aluno aluno2 = new Aluno("Henrique", "henrique@gmail.com", "12345678");
		Aluno aluno3 = new Aluno("Maria", "maria@gmail.com", "14785236");
		
		manter_aluno.setVetor(aluno1);
		manter_aluno.setVetor(aluno2);
		manter_aluno.setVetor(aluno3);
		
		System.out.println(manter_aluno.getVetor().get(0).getNome() + " " + manter_aluno.getVetor().get(0).getEmail() + " " + manter_aluno.getVetor().get(0).getGrr());
		System.out.println(manter_aluno.getVetor().get(1).getNome() + " " + manter_aluno.getVetor().get(1).getEmail() + " " + manter_aluno.getVetor().get(1).getGrr());
		System.out.println(manter_aluno.getVetor().get(2).getNome() + " " + manter_aluno.getVetor().get(2).getEmail() + " " + manter_aluno.getVetor().get(2).getGrr());
		System.out.println("Fim primeira parte");
		System.out.println();
		
		System.out.println("Inserindo um Aluno");
		manter_aluno.inserirAluno("Luiz", "l@ig.com", "14785236");
		System.out.println(manter_aluno.getVetor().get(3).getNome() + " " + manter_aluno.getVetor().get(3).getEmail() + " " + manter_aluno.getVetor().get(3).getGrr());
		System.out.println("Fim segunda parte");
		System.out.println();
		
		System.out.println("Removendo dois alunos");
		manter_aluno.removerAluno("75153595");
		for (int i = 0; i < manter_aluno.getVetor().size(); i++) {
			System.out.println(manter_aluno.getVetor().get(i).getNome() + " " + manter_aluno.getVetor().get(i).getEmail() + " " + manter_aluno.getVetor().get(i).getGrr());
		}
		System.out.println();
		
		manter_aluno.removerAluno("12345678");
		for (int i = 0; i < manter_aluno.getVetor().size(); i++) {
			System.out.println(manter_aluno.getVetor().get(i).getNome() + " " + manter_aluno.getVetor().get(i).getEmail() + " " + manter_aluno.getVetor().get(i).getGrr());
		}
		System.out.println("Fim terceira parte");
		System.out.println();
		
		System.out.println("Removendo alguem que não existe");
		manter_aluno.removerAluno("123456789");
		System.out.println("Fim quarta parte");
		System.out.println();
		
		System.out.println("Inserindo mais dois alunos e guardando eles num arquivo");
		manter_aluno.inserirAluno("Kyaha", "ky@ig.com", "45685239");
		manter_aluno.inserirAluno("Lucas", "lucas@gmail.com", "75846923");
		manter_aluno.salvarAluno();
		System.out.println("Fim quinta parte");
		System.out.println();
		
		System.out.println("Lendo do arquivo");
		manter_aluno.recuperarAluno();
		for (int i = 0; i < manter_aluno.getVetor().size(); i++) {
			System.out.println(manter_aluno.getVetor().get(i).getNome() + " " + manter_aluno.getVetor().get(i).getEmail() + " " + manter_aluno.getVetor().get(i).getGrr());
		}
		System.out.println("Fim última parte");
		
        teclado.close();
	}

}
