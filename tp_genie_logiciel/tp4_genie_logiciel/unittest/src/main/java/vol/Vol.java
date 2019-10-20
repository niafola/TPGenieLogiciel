package vol;

import java.time.*;
import java.lang.*;

public class Vol {

	private String identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	private Duration duree;
	private int nbrePassagers;
	private final int nbreMaxPassagers = 853;

	public Vol(String id) {
    		this.identifiant = id.toUpperCase();
  	}

	

	public Vol(){

	}

	public Vol(String identifiant, ZonedDateTime depart, ZonedDateTime arrivee, int nbrePassagers){
		this.identifiant = identifiant;
		this.depart = depart;
		this.arrivee = arrivee;
		this.nbrePassagers = this.nbrePassagers;
		this.duree = Duration.between(this.arrivee, this.depart);

	}

	

	public void ouvrir(){
		if(this.nbrePassagers < this.nbreMaxPassagers){
			System.out.println("Le vol n° "+this.identifiant+ 
			" est ouvert !");
		}

	}

	public void fermer(){
		if(this.nbrePassagers == nbreMaxPassagers){
			System.out.println("Le vol n° "+this.identifiant+ 
			" est fermé ! Le nombre maximal de passagers est atteint");
		}

	}

	public static Vol toUpperId(String id){
		
		return new Vol(id);
	}

	public static Vol toUpperId(int id){
		
		throw new IllegalArgumentException();
	}

	public static Vol toUpperId(double id){
		
		throw new IllegalArgumentException();
	}

	public static Vol concatId(String value){
		return new Vol("1234 air bus" + value);
	}

	public static Vol concatId(int value){
		throw new IllegalArgumentException();
	}

	public static Vol concatId(double value){
		throw new IllegalArgumentException();
	}

	
}
