package tp5_héritage_interface;

public abstract class Lotissement implements GestionPropriete {
    protected Proprité[] tabProp;
    protected int nombre;

    Lotissement(int capacite) {
        tabProp = new Proprité[capacite];
    }

    @Override
    public boolean ajouter(Proprité p) {
        if (nombre < tabProp.length) {
            tabProp[nombre++] = p;
            return true;
        } else {
            System.out.println("Lotissement plein, impossible d'ajouter une nouvelle propriété.");
            return false;
        }
    }

    @Override
    public boolean supprimer(Proprité p) {
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i].equals(p)) {
                for (int j = i; j < nombre - 1; j++) {
                    tabProp[j] = tabProp[j + 1];
                }
                nombre--;
                return true;
            }
        }
        return false;
    }

    public void afficherProprietes() {
        for (int i = 0; i < nombre; i++) {
            System.out.println(tabProp[i].toString() + ", Impôt à payer : " + tabProp[i].calculImpot());
        }
    }

    public int getNbPieces() {
        int total = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof Propritéprivé) {
                total += ((Propritéprivé) tabProp[i]).getNbpieces();
            }
        }
        return total;
    }

    public Proprité getProprieteMoinsImpots() {
        if (nombre > 0) {
            Proprité moinsImpots = tabProp[0];
            for (int i = 1; i < nombre; i++) {
                if (tabProp[i] instanceof Propritéprivé) {
                    Proprité actuelle = tabProp[i];
                    if (actuelle.calculImpot() < moinsImpots.calculImpot()) {
                        moinsImpots = actuelle;
                    }
                }
            }
            return moinsImpots;
        }
        return null;
    }
}
