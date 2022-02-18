/*Enunciado:
 * Construa um método que receba uma temperatura em graus Celsius e calcule e retorne o valor
 * da temperatura equivalente em graus Farenheit. Celsius = 5.0/9.0 (farenheit -32).*/
import java.util.Scanner;
import java.io.*;
public class Temperatura {

    private float temperatura;
    
	public Temperatura (float temp_celcius) {
		this.temperatura = temp_celcius;
	}
	
	public float get_temp() {
		return this.temperatura;
	}
	
	public float far_to_celcius() {
		float farenheit = (this.temperatura * 9/5) + 32;
		return farenheit;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Escreva uma temperatura em Graus Celcius: ");
		Temperatura temp = new Temperatura(teclado.nextFloat());

		System.out.println(temp.get_temp() + "°C equivale a " + temp.far_to_celcius() + "°F.");
		
		teclado.close();

	}

}
