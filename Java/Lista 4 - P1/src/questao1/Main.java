package questao1;

public class Main {

	public static void main(String[] args) {		
		Fila f = new Fila();
		
		f.enqueue(new Node(1));
		f.enqueue(new Node(2));
		f.enqueue(new Node(3));
		f.getP().print();
		
		f.dequeue();
		f.getP().print();
		
		f.enqueue(new Node(1));
		f.getP().print();

	}

}
