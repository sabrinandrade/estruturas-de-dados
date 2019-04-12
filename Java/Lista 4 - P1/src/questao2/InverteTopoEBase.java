package questao2;

public class InverteTopoEBase {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		p.push(new Node(1));
		p.push(new Node(2));
		p.push(new Node(3));
		p.push(new Node(4));
		p.print();
		
		p = inverte(p);
		p.print();
	}
	
	public static Pilha inverte(Pilha p) {
		Pilha aux = new Pilha();
		Node primeiro = null;
		Node ultimo = p.pop();
		
		while(p.size() > 1)
			aux.push(p.pop());
		
		primeiro = p.pop();
		p.push(ultimo);
		
		while(aux.size() > 0)
			p.push(aux.pop());
		
		p.push(primeiro);
		
		return p;
	}

}
