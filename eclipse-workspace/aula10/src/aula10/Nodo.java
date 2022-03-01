package aula10;

public class Nodo<E> {
    
	private E elemento;
    private Nodo<E> proximo;
    
    
    public E getNodoElemento() {
    	return this.elemento;
    }
    
    public void setNodoElemento(E elemento) {
    	this.elemento = elemento;
    }
    
    public Nodo<E> getNodoProximo() {
    	return this.proximo;
    }
    
    public void setNodoProximo(Nodo<E> p) {
    	this.proximo = p;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
