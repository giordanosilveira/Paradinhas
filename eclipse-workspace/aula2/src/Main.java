import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException { 
		int a;
		BufferedReader teclado;
		teclado = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Digite um numero");
        a = Integer.parseInt(teclado.readLine());
        
        switch (a) {
            case 0: System.out.println("zero"); break;
            case 1: System.out.println("um"); break;
            case 2: System.out.println("dois"); break;
            case 3: System.out.println("tres"); break;
            case 4: System.out.println("quatro"); break;
            case 5: System.out.println("cinco"); break;
            case 6: System.out.println("seis"); break;
            case 7: System.out.println("sete"); break;
            case 8: System.out.println("oito"); break;
            case 9: System.out.println("nove"); break;
            default : System.out.println("Numero desconhecido");
        }

	}

}
