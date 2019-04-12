package questao5;

public class InvertePilha {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		p.push(new Node(1));
		p.push(new Node(2));
		p.push(new Node(3));
		p.push(new Node(4));
		p.print();
		
		p = invertePilha(p);
		p.print();

	}

	
	public static Pilha invertePilha(Pilha p) {
		Fila f = new Fila();
		
		while(p.size() > 0)
			f.enqueue(p.pop());
		
		while(f.size() > 0)
			p.push(f.dequeue());
		
		return p;
	}
}
