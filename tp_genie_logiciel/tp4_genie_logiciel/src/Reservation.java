import java.util.*;

public class Reservation{
	
	public Date date ;
	public String identifiant;
	public String etat;

	private Client client;
	private Vol vol;
	private Passager passager;

	
	public Reservation(){
	
	}

	public Reservation(Date date, String identifiant, String etat){
		
		this.date = date;
		this.identifiant = identifiant;
		this.etat = etat;

	}

	
	public void annuler(){
		//On met l'état à annulee
		this.etat = "annulee";
		System.out.println("Réservation "+this.etat);
	}

	public void confirmer(){
		//On met l'état à confirmee
		this.etat = "confirmee";
		System.out.println("Réservation "+this.etat);
	}

	public void payer(){
		//On met l'état à payee
		this.etat = "payee";
		System.out.println("Réservation "+this.etat);
	}

}
