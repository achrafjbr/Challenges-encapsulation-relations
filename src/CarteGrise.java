public class CarteGrise {
    private int numero;
    private Proprietaire proprietaire;
    private String dateEmission;

    public CarteGrise(int numero, Proprietaire proprietaire, String dateEmission) {
        this.numero = numero;
        this.proprietaire = proprietaire;
        this.dateEmission = dateEmission;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(String dateEmission) {
        this.dateEmission = dateEmission;
    }
}
