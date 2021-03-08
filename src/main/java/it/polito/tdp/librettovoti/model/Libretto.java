package it.polito.tdp.librettovoti.model;
import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List<Voto> voti ; //lista di voti - variabile di tipo List (interfaccia)
	
	public Libretto () {
		this.voti = new ArrayList<>(); //inizializzo la variabile di tipo List come un ArrayList
	}
	
	public void  add(Voto v) { //delega
	this.voti.add(v);
	}
	
	public String toString() {
		String s = "";
		
		for(Voto v: this.voti) {
			s= s + v.toString() + "\n" ;  
		}
		
		return s;
	}

}
