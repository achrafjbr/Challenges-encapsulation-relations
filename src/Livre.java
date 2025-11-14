import java.util.ArrayList;
import java.util.List;

public class Livre {

    private String titre;
    private String auteur;
    private int isbn;
    private List<Auteur> auteurs;

    public Livre(String titre, String auteur, int isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.auteurs = new ArrayList<>();
    }

    public List<Auteur> getAuteurs() {
        return auteurs;
    }

    public void setAuteurs(List<Auteur> auteurs) {
        this.auteurs = auteurs;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

        public void ajouterAuteur(Auteur auteur) {
            auteurs.add(auteur);
        }

        public void afficherLesAuteurDunLive(){
            System.out.println("Les Auteur d'un Livre");
            for (Auteur auteur: getAuteurs()){
            System.out.println(auteur.getNom());
        }
    }
}
