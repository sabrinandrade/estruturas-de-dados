package questao3;

public class SeparaParesEImpares {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		p.push(new Node(1));
		p.push(new Node(2));
		p.push(new Node(3));
		p.push(new Node(4));
		p.push(new Node(5));
		p.print();
		
		p = separaNumeros(p);
		p.print();

	}
	
	public static Pilha separaNumeros(Pilha p) {
		Pilha pares = new Pilha();
		Pilha impares = new Pilha();
		
		while(p.size() > 0) {			
			if(p.peek().getValue() % 2 == 0)
				pares.push(p.pop());
			else
				impares.push(p.pop());
			
		}
		
		while(pares.size() > 0)
			p.push(pares.pop());
		
		while(impares.size() > 0)
			p.push(impares.pop());
		
		return p;
	}

}
