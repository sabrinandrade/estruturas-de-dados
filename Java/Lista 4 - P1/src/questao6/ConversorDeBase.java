package questao6;

public class ConversorDeBase {

	public static void main(String[] args) {
		Pilha p = converteBase(10);
		p.print();
		
		p = converteBase(2);
		p.print();
		
		p = converteBase(100);
		p.print();
		

	}
	
	public static Pilha converteBase(int numero) {
		Pilha p = new Pilha();
		
		while(numero > 0) {
			p.push(new Node(numero % 2));
			numero /= 2;
		}
		
		return p;
	}

}
