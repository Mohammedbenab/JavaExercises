package Joueurs;
import com.sdz.modeJeu.*;
public abstract class Joueurs {
	
	protected Proposition proposition = new AucuneCombi();
	protected Reponse reponse = new ReponseNull();
	
	public Joueurs(Proposition proposition, Reponse reponse) {
		this.proposition = proposition;
		this.reponse = reponse;
	}
	
	
	//Constructor par defaut
	public Joueurs() {};
	
	// M�thode de d�fense
	public void votreProposition() {
		proposition.combinaison(0);
	}
	
	//M�thode de r�ponse
	public void votreReponse() {
		reponse.repondre(null, null);
	}
	
	//
	public void setProposition(Proposition proposition) {
		this.proposition = proposition;
	}
	
	//
	public void setReponse(Reponse reponse) {
		this.reponse = reponse;
	}

}