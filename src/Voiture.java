public class Voiture {

    private int immatriculation;
    private String marque;
    private int modele;
    private CarteGrise carteGrise;

    public Voiture(int immatriculation, String marque, int modele) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.modele = modele;
    }

    public CarteGrise getCarteGrise() {
        return carteGrise;
    }

    public void setCarteGrise(CarteGrise carteGrise) {
        this.carteGrise = carteGrise;
    }

    public int getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(int immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getModele() {
        return modele;
    }

    public void setModele(int modele) {
        this.modele = modele;
    }

    public void lierCarteGrise(CarteGrise c) {
        carteGrise = c;
    }

    public void afficherLaliaison() {
        System.out.println("La Voiture de matriculation " + getImmatriculation() + " , Lier avec La Carte grise N° " + carteGrise.getNumero() + ", De " + carteGrise.getProprietaire().getNom() + " ");
    }
}
