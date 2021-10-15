package br.unitins.ds.a1;

import java.util.Random;

public class Stack<T> {
	private final int LENGTH = 5;
	private T[] list = null;
	private int actualPosition;
	
	Stack(){
		this.actualPosition = 0;
		this.list = (T[]) new Object[this.LENGTH];
	}
	
	private void addMoreLength() {
		T[] newList = (T[]) new Object[list.length + this.LENGTH];
		for(int i = 0; i<list.length;i++) {
			newList[i] = list[i];
		}
		this.list = newList;
	}
	
	/**Inserção do dado
	* Caso a posição atual extrapole o tamanho da estrutura, realoca-o em outra lista**/
	public void push(T data) {
		if(this.actualPosition>=list.length) {
			this.addMoreLength();
		}
		
		list[actualPosition] = data;
		this.actualPosition++;
	}
	/**
	 * Remove e retorna o último elemento
	 * Se a posição atual - 1 for menor que zero, o retorno vai ser nulo
	 * O valor de retorno vai receber o ultimo elemento não nulo da lista
	 * Coloca o ultimo elemento não nulo da lista como nulo
	 * Decresce a posição atual em um
	 **/
	public T pop() {
		T returnValue = null;
		if(this.actualPosition -1 <0) {
			return null;
		}
//		returnValue = this.list[actualPosition-1];
//		this.list[actualPosition-1] = null;
//		if(this.actualPosition>=1) {
//			this.actualPosition--;
//		}
		for(int i = actualPosition-1;i>0;i--){
			if(list[i]!=null) {
				returnValue = list[i];
				list[i]=null;
				return returnValue;
			}
		}
		return returnValue;
	}
	public void printData() {
		for(int i=0; i<list.length;i++) {
			if(list[i]!=null)
				System.out.println(list[i]);
		}
	}
	
	public int getLength() {
		return list.length;
	}
}
