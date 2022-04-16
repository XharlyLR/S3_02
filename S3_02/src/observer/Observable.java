package observer;

import java.util.ArrayList;

public class Observable {

	private ArrayList<Observer> observadors = new ArrayList<Observer>();
	private int valor;
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
		notificarObservadors();
	}
	
	public void addObserver(Observer observer) {
		observadors.add(observer);
	}

	private void notificarObservadors() {
		observadors.forEach(obs -> obs.actualizar());		
	}
	
	
}
