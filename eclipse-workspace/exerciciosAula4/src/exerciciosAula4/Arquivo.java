package exerciciosAula4;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

public class Arquivo {
	
	public void gravaAluno(Vector<Aluno> lista_aluno) {
		try {
			FileOutputStream arq = new FileOutputStream(new File("alunos.dat"));
			ObjectOutputStream out = new ObjectOutputStream(arq);
			out.writeInt(lista_aluno.size());
			out.flush();
			for (int i = 0; i < lista_aluno.size(); i += 1) {
				Aluno aluno = lista_aluno.get(i);
				out.writeObject(aluno);
				out.flush();
			}
			out.close();
		}
		catch (IOException exc) {
			System.out.println("Erro ao Gravar o arquivo");
		}
	}
	
	public Vector<Aluno> leAluno() {
		Vector<Aluno> vetor_alunos = new Vector<Aluno>();
		try {
			//String file_name = "/home/pingo/Documentos/Paradinhas/eclipse-workspace/exerciciosAula4/alunos.dat";
			FileInputStream arq = new FileInputStream(new File("alunos.dat"));
			ObjectInputStream in = new ObjectInputStream(arq);
			int size = in.readInt();
			for (int i = 0; i < size; i++) {
				Aluno aluno = (Aluno) in.readObject();
				vetor_alunos.add(aluno);
			}
			in.close();
		}
		catch(IOException ioex){
			System.out.println("Erro ao ler o arquivo " +ioex);
		}
		catch (ClassNotFoundException cnfe) {
			System.out.println("Não achou a classe");
		}
		return vetor_alunos;
	}
	
	public static void main(String[] args) {
		/*Scanner teclado = new Scanner(System.in);
		Arquivo arq = new Arquivo();
		
		
		for (int i = 0; i < 3; i += 1) {
			String nome, email, grr;
			
			System.out.println("Leia o nome, o email e o grr do " +(i+1)+"º aluno");
			nome = teclado.nextLine();
			email = teclado.nextLine();
			grr = teclado.nextLine();
			
			Aluno aluno = new Aluno(nome, email, grr);
			arq.gravaVetorAluno(aluno);
		}
		arq.gravaAluno(arq.getVector());
		arq.leAluno(arq.getVector());
		
		//arq.getVector().*/
		
	}

}
