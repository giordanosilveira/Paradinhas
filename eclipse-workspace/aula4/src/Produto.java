import java.util.Scanner;

/*Enunciado:
 * Escreva os métodos get e set para os outros atributos da classe Produto, e coloque a
 * visibilidade apropriada para os atributos.*/
public class Produto {

	private int codigo;
	private int quantidade;
	private String nome;
	private double preco;
	
	
	public int get_codigo () {
		return this.codigo;
	}
	
	public String get_nome () {
		return this.nome;
	}
	
	public int get_quantidade () {
		return this.quantidade;
	}
	
	public double get_preco () {
		return this.preco;
	}
	
	public void set_codigo(int new_codigo) {
		this.codigo = new_codigo;
	}
	
	public void set_nome(String new_nome) {
		this.nome = new_nome;
	}
	
	public void set_quantidade(int new_qntd) {
		this.quantidade = new_qntd;
	}
	
	public void set_preco(double new_preco) {
		this.preco = new_preco;
	}
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		Produto prod = new Produto();
		
		System.out.println("SETTERS:");
		System.out.println();
		prod.set_codigo(12345);
		prod.set_nome("KINDLE");
		prod.set_preco(230.00);
		prod.set_quantidade(100);
		
		
		System.out.println("GETTERS:");
		System.out.println();
		
		System.out.println("Código do produto: " +prod.get_codigo());
		System.out.println("Nome do produto: " +prod.get_nome());
		System.out.println("Quantidade do produto: " +prod.get_quantidade());
		System.out.println("Preço do produto: " +prod.get_preco());
	    
		System.out.println();
		System.out.println("SETTERS: ");
		System.out.println();
		
		prod.set_codigo(1);
		prod.set_nome("Limão Seciliano");
		prod.set_preco(10.0);
		prod.set_quantidade(1000);
		
		System.out.println();
		System.out.println("Produto atualizado");
		System.out.println();
		
		System.out.println("Novo código do produto: " +prod.get_codigo());
		System.out.println("Novo nome do produto: " +prod.get_nome());
		System.out.println("Nova quantidade do produto: " +prod.get_quantidade());
		System.out.println("Novo preço do produto: " +prod.get_preco());		
		
		teclado.close();

	}

}
