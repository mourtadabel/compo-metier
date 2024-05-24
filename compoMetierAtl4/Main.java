package compoMetierAtl4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

        JoueurDAO joueurDAO = new JoueurDaoImpl();
			
			
        Joueur joueur1 = new Joueur();
        joueur1.setPrenom("Alice");
        joueur1.setCash(100);

        Joueur joueur2 = new Joueur();
        joueur2.setPrenom("Bob");
        joueur2.setCash(200);

        // Ajouter des joueurs
        joueurDAO.addJoueur(joueur1);
        joueurDAO.addJoueur(joueur2);

        // Lister tous les joueurs
        System.out.println("Tous les joueurs:");
        for (Joueur joueur : joueurDAO.getTousLesJoueurs()) {
            System.out.println("Prenom: " + joueur.getPrenom() + ", Cash: " + joueur.getCash());
        }

        // Mettre � jour un joueur
        joueur1.setCash(150);
        joueurDAO.updateJoueur(joueur1);

        // Supprimer un joueur
        joueurDAO.deleteJoueur(joueur2);

        // Lister tous les joueurs apr�s les modifications
        System.out.println("\nApr�s modifications:");
        for (Joueur joueur : joueurDAO.getTousLesJoueurs()) {
            System.out.println("Prenom: " + joueur.getPrenom() + ", Cash: " + joueur.getCash());
        }
        
    }
}