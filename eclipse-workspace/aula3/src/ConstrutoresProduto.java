import java.util.Scanner;

/*Enunciado:
 * Crie construtores para as classes Pessoa e Produto.*/
public class ConstrutoresProduto {

	private int codigo;
	private int quantidade;
	private double preco;
	private String nome;
	
	public ConstrutoresProduto (int codigo, String nome, int quantidade, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
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
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva o codigo, nome, quantidade e preço do produto");
		int cod = teclado.nextInt();
		String nome = teclado.nextLine();
		teclado.nextLine();
		int quantidade = teclado.nextInt();
		double preco = teclado.nextDouble();
		
		ConstrutoresProduto prod = new ConstrutoresProduto(cod, nome, quantidade, preco);
		
		System.out.println("Informações produto: ");
		System.out.println("Codigo: " +prod.get_codigo());
		System.out.println("Nome: " +prod.get_nome());
		System.out.println("Quantidade: " +prod.get_quantidade());
		System.out.println("Preço: " +prod.get_preco());
		teclado.close();

	}

}
