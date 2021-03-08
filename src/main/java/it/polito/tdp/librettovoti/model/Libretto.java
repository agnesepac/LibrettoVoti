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

	/*
	public void stampaVotiUguali (int punteggio) {
		//il libretto stampa da solo i voti
		
		System.out.println();	}
	
	public String votiUguali (int punteggio) {
		//calcola una stringa che contiene i voti
		//sarà poi il chiamante a stamparli -> MEGLIO QUESTO METODO DEL PRECEDENTE
		// -> Solo il NOME?
		// -> Tutto il voto.toString();
		
	}  */
	
	public List <Voto> listaVotiUguali (int punteggio){
		 //restituisce solo i voti uguali al criterio
		
		//il difetto di questo metodo è che espone all'esterno il tipo di dato utilizzato
		//per memorizzare i dati, quindi se decidessi di organizzare i dati in modo diverso
		//dovrei modificare il metodo
		
		List<Voto> risultato = new ArrayList<>();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v); //lo stesso v sarà contenuto in 2 liste DIVERSE
			}
		}
		
		return risultato;
	
	}
	
	
	 public Libretto votiUguali(int punteggio) {
		//restituisco un libretto che contenga solo i corsi con voti superiori a 25

	 Libretto risultato = new Libretto();
	 for(Voto v: this.voti) {
		 if(v.getVoto()==punteggio) {
			risultato.add(v);
		 }	 
	 }
	 
	 return risultato;
	 } 
}
