package observer;

public class PrimerObserver extends Observer{

	public PrimerObserver(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}
	
	@Override
	public void actualizar() {
		System.out.println("El valor ha canviat a: " + observable.getValor());
	}

}
