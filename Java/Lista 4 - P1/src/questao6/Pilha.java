package questao6;

public class Pilha {

	private Node top;
	private int tamanho;

	public Pilha() {
		this.top = null;
		this.tamanho = 0;
	}

	public void push(Node i) {
		i.setNext(top);
		this.top = i;

		this.tamanho++;
	}
	
	public Node pop() {
		Node retorno = null;
		
		if(this.top == null)
			System.out.println("Pilha vazia");
		else {
			retorno = top;
			this.top = this.top.getNext();
			tamanho--;
		}
		
		return retorno;
		
	}
	
	public Node peek() {
//		Node peek = pop();
//		push(peek);
//		
//		return peek;
		
		return this.top;
	}
	
	public int size() {
		return this.tamanho;
	}
	
	public void print() {
		Node aux = this.top;
		
		while(aux != null) {
			System.out.println(aux.getValue());
			aux = aux.getNext();
		}
		
		System.out.println();
	}

}
