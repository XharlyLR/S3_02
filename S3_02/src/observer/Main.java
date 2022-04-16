package observer;

public class Main {

	public static void main(String[] args) {
		Observable borsa = new Observable();
		
		new PrimerObserver(borsa);
		
		borsa.setValor(7);
	}

}
