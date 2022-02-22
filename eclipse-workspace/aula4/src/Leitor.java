import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitor {

	private BufferedReader teclado = new BufferedReader (new InputStreamReader(System.in));
	
	public String leString() throws IOException {
		return teclado.readLine();
	}
	
	public int leNumeroInt() throws IOException, NumberFormatException {
		return Integer.parseInt(this.leString());
	}
	
	public float leNumeroFloat() throws IOException, NumberFormatException {
		return  Float.parseFloat(this.leString());
	}
	
	public static void main(String[] args) throws IOException {
		
		Leitor leitor = new Leitor();
		
		System.out.println("String: " + leitor.leString());

	}

}
