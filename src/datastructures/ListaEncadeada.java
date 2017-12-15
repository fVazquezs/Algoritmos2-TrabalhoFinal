package datastructures;
import java.util.Scanner;

import model.Aluno;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Comparator;

public class ListaEncadeada<T> {
	public class  no {
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
	private no head;
	private no tail;
	
	public void append(T dado){
		no novo = new no(dado);
		if(tail!=null) {
			tail.next = novo;
		}else {
			head = novo;
		}
		novo.previous = tail;
		tail = novo;
	}
	public void addFirst(T dado){
		no novo = new no(dado);
		if(head != null) {
			head.previous = novo;
		} else {
			tail = novo;
		}
		novo.next = head;
		head = novo;
	}
	public T search(T key, Comparator<T> cmp)
	{
		 ListaEncadeada<T>.no i = head;
	        while (i != null){
	            if(cmp.compare(key, i.dado) == 0)
	                return i.dado;
	        }
	        return null;
	    }
	public void printObjects(){
		ListaEncadeada<T>.no i = head;
		while (i != null){
			System.out.println(i.dado);
			i = i.next;
			}
	}
	
	public static<T> ListaEncadeada<T> loadFromFile(FileReader arquivo) throws FileNotFoundException{
		Scanner s = new Scanner(arquivo);
		s.useDelimiter("[,\n]");
		
	 	ListaEncadeada lista = new ListaEncadeada<Aluno>();
	 	int x = 0;
	 	while(s.hasNext()){
	 		Aluno a =  new Aluno(s.next(), s.next(), s.next(), s.next(), s.next(), s.next(), s.next());
	 		if(x == 0){
	 			lista.addFirst(a);
	 		}else{
	 			lista.append(a);
	 		}
	 		x++;	
	 	}
		return lista;
	}
}
