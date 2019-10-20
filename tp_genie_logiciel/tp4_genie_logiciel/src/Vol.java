import java.time.*;
import java.lang.*;

public class Vol {

	private String identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	private Duration duree;
	private int nbrePassagers;
	//nbre max de passager pour un vol fixé à 853
	private final int nbreMaxPassagers = 853;

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
		//Si le nombre de passagers du vol est inférieur 
		//au nombre max de passagers, on indique que le vol est ouvert
		if(this.nbrePassagers < this.nbreMaxPassagers){
			System.out.println("Le vol n° "+this.identifiant+ 
			" est ouvert !");
		}

	}

	public void fermer(){
		//Si le nombre de passagers du vol est egal 
		//au nombre max de passagers, on indique que le vol est fermé
		if(this.nbrePassagers == nbreMaxPassagers){
			System.out.println("Le vol n° "+this.identifiant+ 
			" est fermé ! Le nombre maximal de passagers est atteint");
		}

	}
}
