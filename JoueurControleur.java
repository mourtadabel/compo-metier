public class JoueurControleur {
    private Joueur modele;
    private JoueurVue vue;

    public JoueurControleur(Joueur modele, JoueurVue vue) {
        this.modele = modele;
        this.vue = vue;
        updateVue();
    }

    public void setPrenom(String prenom) {
        modele.setPrenom(prenom);
        updateVue();
    }

    public void setCash(int cash) {
        modele.setCash(cash);
        updateVue();
    }

    public String getPrenom() {
        return modele.getPrenom();
    }

    public int getCash() {
        return modele.getCash();
    }

    public void updateVue() {
        vue.afficherFicheJoueur(modele.getPrenom(), modele.getCash());
    }
}
