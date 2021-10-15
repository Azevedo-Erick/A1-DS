package br.unitins.ds.a1;

public enum Naipe {
	ESPADAS(1,"Espadas"),PAUS(2,"Paus"),COPAS(3,"Copas"),OURO(4, "Ouro");
	
	private int id;
	private String label;
	Naipe(int id, String label){
		this.id = id;
		this.label=label;
	}

	public int getId() {
		return id;
	}


	public String getLabel() {
		return label;
	}

	
	
	
}
