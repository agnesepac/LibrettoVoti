package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {
	
	public static void main(String[] args) {

	System.out.println("Test metodi di Libretto");
	Libretto libretto = new Libretto(); //creo libretto
	
	
	//aggiungo voti nel libretto
	
	Voto voto1= new Voto("Analisi 1", 30, LocalDate.of(2019, 2, 15));
	
	libretto.add(voto1);
	libretto.add(new Voto("Fisica 1", 28, LocalDate.of(2019, 7, 15)));
	libretto.add(new Voto("Informatica", 24, LocalDate.of(2019, 9, 15)));
	
	//Stampo contenuto libretto
	
	System.out.println(libretto); 
}

}