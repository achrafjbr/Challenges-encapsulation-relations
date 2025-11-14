import java.util.ArrayList;
import java.util.List;

public class Auteur {

    String nom;
    List<Livre> livresEcrits;

    public Auteur(String nom) {
        this.nom = nom;
        this.livresEcrits =  new ArrayList<>();
    }

    public List<Livre> getLivresEcrits() {
        return livresEcrits;
    }

    public void setLivresEcrits(List<Livre> livresEcrits) {
        this.livresEcrits = livresEcrits;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void ajouterLivre(Livre livre){
        livresEcrits.add(livre);
    }

    public void afficherLesLivresDunAuteur(){
        System.out.println("Les livres d'un Auteur");
        for (Livre livre: getLivresEcrits()){
            System.out.println(livre.getTitre());
        }
    }
}
