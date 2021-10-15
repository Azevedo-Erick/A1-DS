package br.unitins.ds.a1;

import java.util.Random;

public class Baralho {
	private Stack<Card> cartas = new Stack<Card>();
	private int len;
	
	public void getNewCard() {
			int aux = new Random().nextInt(4)+1;
			int num = new Random().nextInt(12)+1;
			Card carta;
			Naipe nai=null;
			if(aux==1) {
				nai=Naipe.COPAS;
			}else if(aux==2) {
				nai=Naipe.ESPADAS;
			}else if(aux==3) {
				nai=Naipe.OURO;
			}else if(aux==4) {
				nai=Naipe.PAUS;
			}
			carta = new Card(num, nai);
			this.getCartas().push(carta);
		}
	
	Baralho(){
		
		
//		//Copas
//		this.getCartas().push(new Card(1,Naipe.COPAS));
//		this.getCartas().push(new Card(2,Naipe.COPAS));
//		this.getCartas().push(new Card(3,Naipe.COPAS));
//		this.getCartas().push(new Card(4,Naipe.COPAS));
//		this.getCartas().push(new Card(5,Naipe.COPAS));
//		this.getCartas().push(new Card(6,Naipe.COPAS));
//		this.getCartas().push(new Card(7,Naipe.COPAS));
//		this.getCartas().push(new Card(8,Naipe.COPAS));
//		this.getCartas().push(new Card(9,Naipe.COPAS));
//		this.getCartas().push(new Card(10,Naipe.COPAS));
//		this.getCartas().push(new Card(11,Naipe.COPAS));
//		this.getCartas().push(new Card(12,Naipe.COPAS));
//		this.getCartas().push(new Card(13,Naipe.COPAS));
//		
//		//Espadas
//		this.getCartas().push(new Card(1,Naipe.ESPADAS));
//		this.getCartas().push(new Card(2,Naipe.ESPADAS));
//		this.getCartas().push(new Card(3,Naipe.ESPADAS));
//		this.getCartas().push(new Card(4,Naipe.ESPADAS));
//		this.getCartas().push(new Card(5,Naipe.ESPADAS));
//		this.getCartas().push(new Card(6,Naipe.ESPADAS));
//		this.getCartas().push(new Card(7,Naipe.ESPADAS));
//		this.getCartas().push(new Card(8,Naipe.ESPADAS));
//		this.getCartas().push(new Card(9,Naipe.ESPADAS));
//		this.getCartas().push(new Card(10,Naipe.ESPADAS));
//		this.getCartas().push(new Card(11,Naipe.ESPADAS));
//		this.getCartas().push(new Card(12,Naipe.ESPADAS));
//		this.getCartas().push(new Card(13,Naipe.ESPADAS));
//		
//		//Paus
//		this.getCartas().push(new Card(1,Naipe.PAUS));
//		this.getCartas().push(new Card(2,Naipe.PAUS));
//		this.getCartas().push(new Card(3,Naipe.PAUS));
//		this.getCartas().push(new Card(4,Naipe.PAUS));
//		this.getCartas().push(new Card(5,Naipe.PAUS));
//		this.getCartas().push(new Card(6,Naipe.PAUS));
//		this.getCartas().push(new Card(7,Naipe.PAUS));
//		this.getCartas().push(new Card(8,Naipe.PAUS));
//		this.getCartas().push(new Card(9,Naipe.PAUS));
//		this.getCartas().push(new Card(10,Naipe.PAUS));
//		this.getCartas().push(new Card(11,Naipe.PAUS));
//		this.getCartas().push(new Card(12,Naipe.PAUS));
//		this.getCartas().push(new Card(13,Naipe.PAUS));
//		
//		//Ouro
//		this.getCartas().push(new Card(1,Naipe.OURO));
//		this.getCartas().push(new Card(2,Naipe.OURO));
//		this.getCartas().push(new Card(3,Naipe.OURO));
//		this.getCartas().push(new Card(4,Naipe.OURO));
//		this.getCartas().push(new Card(5,Naipe.OURO));
//		this.getCartas().push(new Card(6,Naipe.OURO));
//		this.getCartas().push(new Card(7,Naipe.OURO));
//		this.getCartas().push(new Card(8,Naipe.OURO));
//		this.getCartas().push(new Card(9,Naipe.OURO));
//		this.getCartas().push(new Card(10,Naipe.OURO));
//		this.getCartas().push(new Card(11,Naipe.OURO));
//		this.getCartas().push(new Card(12,Naipe.OURO));
//		this.getCartas().push(new Card(13,Naipe.OURO));
//		this.getCartas().randomize();
	}
	
	public Card puxarCarta() {
		this.getNewCard();
		return this.getCartas().pop();
	}
	
	public Stack<Card> getCartas() {
		return cartas;
	}

	public void setCartas(Stack<Card> cartas) {
		this.cartas = cartas;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	
	
	
	
}
