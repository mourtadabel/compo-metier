package compoMetierAtl4;

import java.util.ArrayList;
import java.util.List;

public class JoueurDaoImpl implements JoueurDAO{
	private List<Joueur> joueurs;
	
	public JoueurDaoImpl() {
		// TODO Auto-generated constructor stub
		joueurs = new ArrayList<>();
	}
	
	@Override
	public List<Joueur> getTousLesJoueurs() {
		return joueurs;
	}
	
	@Override
    public void updateJoueur(Joueur joueur) {
        for (int i = 0; i < joueurs.size(); i++) {
            Joueur j = joueurs.get(i);
            if (j.getPrenom().equals(joueur.getPrenom())) {
                joueurs.set(i, joueur);
                break;
            }
        }
    }

    @Override
    public void deleteJoueur(Joueur joueur) {
        joueurs.removeIf(j -> j.getPrenom().equals(joueur.getPrenom()));
    }
	
	public void addJoueur(Joueur joueur) {
		joueurs.add(joueur);
	}
}
