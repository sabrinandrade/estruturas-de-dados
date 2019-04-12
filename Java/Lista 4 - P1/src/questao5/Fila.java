package questao5;

public class Fila {
	
	private Node front;
	private Node back;
	private int tamanho;
	
	public Fila() {
		this.front = this.back = null;
		this.tamanho = 0;
	}
	
	public void enqueue(Node i) {
		if(this.back == null && this.front == null) {
			this.back = this.front = i;
		} else {
			this.back.setNext(i);
			this.back = i;
		}
		
		tamanho++;
	}
	
	public Node dequeue() {
		Node retorno = null;
		
		if(this.front == null)
			System.out.println("Fila vazia.");
		else {
			retorno = this.front;
			this.front = this.front.getNext();
			tamanho--;
		}
		
		if(this.tamanho == 0)
			this.front = this.back = null;
		else if(this.tamanho == 1) 
			this.back.setNext(null);
		
		return retorno;
	}
	
	public int size() {
		return this.tamanho;
	}
	
	public void print() {
		Node aux = this.front;
		
		while(aux != null) {
			System.out.println(aux.getValue());
			aux = aux.getNext();
		}
		
		System.out.println();
	}
	
}
