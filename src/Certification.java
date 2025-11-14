public class Certification {

    String titre;
    String dateObtention;
    private Etudiant etudiant;

    public Certification(String titre, String dateObtention) {
        this.titre = titre;
        this.dateObtention = dateObtention;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDateObtention() {
        return dateObtention;
    }

    public void setDateObtention(String dateObtention) {
        this.dateObtention = dateObtention;
    }


}
