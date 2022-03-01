
public class Vetor {

	private int vetor[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	public void setAt(int i, int valor) {
		this.vetor[i] = valor;
	}
	
	public int busca (int buscado) {
		for (int i = 0; i < this.vetor.length; i++) {
			if (buscado == this.vetor[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public void exibicao() {
		for (int i = 0; i < this.vetor.length; i++) {
			System.out.print(this.vetor[i] + " ");			
		}
		System.out.println();
	}
	
	public void sort() {
		int temp = 0;
		for (int i = 0; i < this.vetor.length; i++) {
			for (int j = 1; j < this.vetor.length - i; j++) {
				if (this.vetor[j - 1] > this.vetor[j]) {
					temp = this.vetor[j - 1];
					this.vetor[j - 1] = this.vetor[i];
					this.vetor[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
	    Vetor vetor = new Vetor();
	    vetor.setAt(0, 8);
	    vetor.setAt(1, 2);
	    vetor.setAt(2, 10);
	    vetor.setAt(3, 15);
	    vetor.setAt(4, 0);
	    vetor.setAt(5, 7);
	    vetor.setAt(6, 777);
	    vetor.setAt(7, 0);
	    vetor.setAt(8, 80);
	    vetor.setAt(9, 10);
	    
	    vetor.exibicao();
	    vetor.sort();
	    vetor.exibicao();

	}

}
