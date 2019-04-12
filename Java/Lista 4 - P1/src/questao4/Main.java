package questao4;

public class Main {

	public static void main(String[] args) {		
		Pilha p = new Pilha();
		
		p.push(new Node(1));
		p.push(new Node(2));
		p.push(new Node(3));
		p.push(new Node(4));
		p.getF().print();
		
		p.pop();
		p.getF().print();
	}

}
