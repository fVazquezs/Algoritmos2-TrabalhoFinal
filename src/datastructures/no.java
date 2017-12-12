package model;
package datastructures;


public class  no<T> {
	private T dado;
	private no next;
	private no previous;
	
	public no (T dado){
		this.dado = dado;
		this.next = next;
		this.previous = previous;
	}
	
	public void addAfter(T dado){
		no novo = new no(dado);
		no prox = this.next;
		novo.previous = this;
		if(prox == null){
			tail = novo;
		}else{
			prox.previous = novo;
		}
		this.next = novo;
	}
	
	public void addBefore(T dado){
		no novo = new no(dado);
		no ant = this.previous;
		novo.next = this;
		if(ant == null){
			head = novo;
		}else{
			ant.next = novo;
		}
		this.previous = novo;
	}
}
