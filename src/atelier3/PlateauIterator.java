package atelier3;
import java.util.Iterator;

class PlateauIterator implements Iterator<Case> {
    private Plateau plateau;
    private int currentPosition = 0;

    public PlateauIterator(Plateau plateau) {
        this.plateau = plateau;
    }

    @Override
    public boolean hasNext() {
        return currentPosition < plateau.nbCases();
    }

    @Override
    public Case next() {
        if (hasNext()) {
            return plateau.getCase(currentPosition++);
        } else {
            return null;
        }
    }
}
