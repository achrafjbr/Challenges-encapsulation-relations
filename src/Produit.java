public class Produit {

    private String nom;
    private double prixUnitaire;
    private double quantite;

    public Produit(double quantite, double prixUnitaire, String nom) {
        this.quantite = quantite;
        this.prixUnitaire = prixUnitaire;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(double prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }
}
