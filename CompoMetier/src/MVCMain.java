public class MVCMain {
    public static Joueur getJoueurDB() {
        return new Joueur("John", 500);
    }

    public static void main(String[] args) {
        Joueur joueur = getJoueurDB();

        JoueurVue vue = new JoueurVue();

        JoueurControleur controleur = new JoueurControleur(joueur, vue);

        controleur.setCash(controleur.getCash() + 100);

    }
}
