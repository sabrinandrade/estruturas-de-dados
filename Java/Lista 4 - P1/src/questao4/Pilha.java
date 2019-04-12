package questao4;

public class Pilha {
	
	private Fila f;
	
	public Pilha() {
		this.f = new Fila();
	}

	public void push(Node i) {
		f.enqueue(i);
	}
	
	public Node pop() {
		Fila aux = new Fila();
		Node retorno = null;
		
		while(f.size() > 1)
			aux.enqueue(f.dequeue());
		
		retorno = f.dequeue();
		
		while(aux.size() > 0)
			f.enqueue(aux.dequeue());
		
		return retorno;
	}

	public Fila getF() {
		return f;
	}

	public void setF(Fila f) {
		this.f = f;
	}	

}
