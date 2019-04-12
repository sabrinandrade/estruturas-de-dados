package questao1;

public class Fila {

	private Pilha p;
	
	public Fila() {
		this.p = new Pilha();
	}
	
	public void enqueue(Node i) {
		p.push(i);
	}
	
	public Node dequeue() {
		Pilha aux = new Pilha();
		Node retorno = null;
		
		while(p.size() > 1)
			aux.push(p.pop());
		
		retorno = p.pop();
		
		while(aux.size() > 0)
			p.push(aux.pop());
			
		return retorno;
	}

	public Pilha getP() {
		return p;
	}

	public void setP(Pilha p) {
		this.p = p;
	}
	
}
