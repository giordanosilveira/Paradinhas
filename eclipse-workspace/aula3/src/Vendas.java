/*Enunciado:
 * Modifique o programa do cálculo das comissões para que se o valor da comissão ultrapassar
 * 1000 reais o vendedor receba mais 2% sobre o valor total.*/
import java.util.Scanner;
public class Vendas
{
    public static void main(String args[])
    {
    	int qtde;
        double percentagem;
        double produto = 100.0;
        double valcomissao = 0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i <30; i++) {
        	System.out.println("digite quantidade vendida");
        	qtde = teclado.nextInt();
        	if (qtde < 10)
        		valcomissao = comissao(10, qtde, produto);
        	else if (qtde >=30)
        		valcomissao = comissao(15, qtde, produto);
        	else
        		valcomissao = comissao(12, qtde, produto);
        }
        System.out.println("O valor da comissao e "+valcomissao);
        teclado.close();
    }	
    public static double comissao (double perc, int quantidade, double valorProduto) {
    	double valorComissao = (valorProduto * perc * quantidade)/100;
    	if (valorComissao >= 1000)
    		return (valorComissao * 0.02) + valorComissao;
    	return valorComissao;
    }
    
}