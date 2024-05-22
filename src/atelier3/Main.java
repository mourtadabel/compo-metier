package atelier3;

public class Main {
    public static void main(String[] args) {
        Plateau plateau = new Plateau();

        for (int i = 1; i <= 10; i++) {
            plateau.ajouterCase(new Case(i, "Case " + i));
        }

        PlateauIterator iterator = plateau.iterator();
        while (iterator.hasNext()) {
            Case currentCase = iterator.next();
            currentCase.afficher();
        }
    }
}
