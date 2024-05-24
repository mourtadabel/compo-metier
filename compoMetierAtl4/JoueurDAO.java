package compoMetierAtl4;

import java.util.List;

public interface JoueurDAO {
	
	List<Joueur> getTousLesJoueurs();
		
	void updateJoueur(Joueur joueur);
	
	void deleteJoueur(Joueur joueur);
	
	void addJoueur(Joueur joueur);
	

}
