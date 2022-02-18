import java.util.Scanner;

/*Enunciado:
 * Crie construtores para as classes Pessoa e Produto.*/
public class ConstrutoresPessoa {

	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	
	public ConstrutoresPessoa (String nome, String email, String telefone, String endereco) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	public String get_email () {
		return this.email;
	}
	
	public String get_nome () {
		return this.nome;
	}
	
	public String get_telefone () {
		return this.telefone;
	}
	
	public String get_endereco () {
		return this.endereco;
	}
	
	public void set_email(String new_email) {
		this.email = new_email;
	}
	
	public void set_nome(String new_nome) {
		this.nome = new_nome;
	}
	
	public void set_telefone(String new_tel) {
		this.telefone = new_tel;
	}
	
	public void set_endereco(String new_endr) {
		this.endereco = new_endr;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva o nome, email, telefone e endereço da pessoa: ");
		String nome = teclado.nextLine();
		String email = teclado.nextLine();
		String telefone = teclado.nextLine();
		String endereco = teclado.nextLine();
		
		ConstrutoresPessoa prod = new ConstrutoresPessoa(nome, email, telefone, endereco);
		
		System.out.println("Informações pessoa: ");
		System.out.println("Nome: " +prod.get_nome());
		System.out.println("Email: " +prod.get_email());
		System.out.println("Telefone: " +prod.get_telefone());
		System.out.println("Endereço: " +prod.get_endereco());
		teclado.close();

	}

}
