package br.unitins.ds.a1;

public class Card {
	private int number;
	private Naipe naipe;
	
	Card(int number, Naipe naipe){
		this.setNumber(number);
		this.setNaipe(naipe);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	
	@Override
	public String toString() {
 		return this.getNumber() + " de " + this.getNaipe().getLabel();
	}
	
	
}
