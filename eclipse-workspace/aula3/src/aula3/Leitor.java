package aula3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitor {

	public static BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	
	public float leNumeroFloat() throws NumberFormatException, IOException {
		return Float.parseFloat(teclado.readLine());
	}
	
	public int leNumeroInt() throws NumberFormatException, IOException {
		return Integer.parseInt(teclado.readLine());
	}
	
	public double leNumeroDouble() throws NumberFormatException, IOException {
		return Double.parseDouble(teclado.readLine());
	}
	
	public String leString() throws NumberFormatException, IOException {
		return teclado.readLine();
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Leitor leitor = new Leitor();
		
		System.out.println("Float:...");
		float n_float = leitor.leNumeroFloat();
		System.out.println(n_float);
		
		System.out.println("Int:...");
		int n_int = leitor.leNumeroInt();
		System.out.println(n_int);
		
		System.out.println("Double:...");
		double n_double = leitor.leNumeroDouble();
		System.out.println(n_double);
		
		System.out.println("String:...");
		String str = leitor.leString();
		System.out.println(str);

	}

}
