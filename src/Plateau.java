import java.util.ArrayList;
import java.util.List;

class Plateau {
    private List<Case> cases;

    public Plateau() {
        this.cases = new ArrayList<>();
    }

    public void ajouterCase(Case c) {
        cases.add(c);
    }

    public Case getCase(int i) {
        if (i >= 0 && i < cases.size()) {
            return cases.get(i);
        } else {
            return null;
        }
    }

    public int nbCases() {
        return cases.size();
    }

    public PlateauIterator iterator() {
        return new PlateauIterator(this);
    }
}
