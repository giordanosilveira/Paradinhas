/*Enunciado:
  Fazer um programa em java que calcule e imprima as raízes da equação x² +x -6 = 0*/
import java.lang.Math;
public class exercicio2 {

	public static void main(String[] args) {
		int a, b, c;
        float delta;
        a = 1;
        b = 1;
        c = -6;
        
		delta = b*b -4*a*c;
	    if (delta < 0)
	    	System.out.println("Não existe raízes reais");
	    else {
	        System.out.println("x1 = "+ (-b + Math.sqrt(delta))/2*a + " x2 = " + (-b - Math.sqrt(delta))/2*a);
	    }

	}

}
