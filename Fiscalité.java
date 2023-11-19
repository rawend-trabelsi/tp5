package tp5_héritage_interface;

public class Fiscalité {

    public static void main(String[] args) {

        Personne p1 = new Personne(14432565, "Propriétaire1", "Adresse1");
        Personne p2 = new Personne(1787777, "Propriétaire2", "Adresse2");
        Personne p3 = new Personne(1778452, "Propriétaire3", "Adresse3");

        Lotissementprivé lotissement = new Lotissementprivé(10);

        lotissement.ajouter(new Propritéprivé(1, p1, "Corniche", 350, 4));
        lotissement.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));

        lotissement.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 3));
        lotissement.ajouter(new Propriétéprofessionelle(4, p3, "Korba", 1000, 50, true));
        lotissement.ajouter(new Propriétéprofessionelle(5, p1, "Bir Bouragba", 2500, 400, false));

        lotissement.afficherPropriétés();

        System.out.println("Nombre global de pièces : " + lotissement.getNbPieces());

        Propritéprivé proprieteMoinsImpots = (Propritéprivé) lotissement.getProprieteMoinsImpots();
        System.out.println("Propriétaire qui paye le moins d'impôts : " + proprieteMoinsImpots.Responsable.getNom());
        System.out.println("Montant des impôts à payer : " + proprieteMoinsImpots.calculImpot());

        lotissement.supprimer(proprieteMoinsImpots);

        lotissement.afficherPropriétés();
    }
}
