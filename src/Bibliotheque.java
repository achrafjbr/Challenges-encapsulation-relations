import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

    private String nom;
    private List<Livre> livres;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.livres = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public void setLivres(List<Livre> livres) {
        this.livres = livres;
    }


    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void supprimerLivre(Livre livre) {
        System.out.println("Le livre "+livre.getTitre()+" a été supprimer");
        getLivres().remove(livre);
    }

    public void afficherLivres() {
        for (Livre livre : getLivres()) {
            System.out.println("live Isbn:" + livre.getIsbn());
            System.out.println("live Isbn:" + livre.getTitre());
            System.out.println("live Isbn:" + livre.getAuteur());
        }
    }
}
