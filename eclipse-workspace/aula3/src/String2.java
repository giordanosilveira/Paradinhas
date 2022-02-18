import java.util.Scanner;
public class String2 {

	private String frase;
	
	public String2 (String nova_frase) {
		this.frase = nova_frase;	
	}

	public String get_string() {
	    return this.frase;
	}
	
	public String get_string_reversa () {
        StringBuilder frase_reversa = new StringBuilder();
        for (int i = this.frase.length() - 1; i >= 0; i--) {
        	frase_reversa.append(this.frase.charAt(i));
        }
        return frase_reversa.toString();
	}
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva uma palavra ou uma frase: ");
		String2 str = new String2(teclado.nextLine());
		System.out.println(str.get_string_reversa());
		
		teclado.close();

	}

}
