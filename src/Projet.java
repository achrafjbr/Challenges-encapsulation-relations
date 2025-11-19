import java.util.ArrayList;
import java.util.List;

public class Projet {

    private String nom;
    private List<Employe> equipe;

    public Projet(String nom) {
        this.nom = nom;
        this.equipe = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Employe> getEquipe() {
        return equipe;
    }

    public void setEquipe(List<Employe> equipe) {
        this.equipe = equipe;
    }


    public void ajouterEmploye(Employe employe) {
        this.equipe.add(employe);
    }

    public void listeDesEmployésdunProjet(){
            System.out.println("nom de projet"+nom);
        for (int i = 0; i < equipe.size(); i++) {
            System.out.println("Son projet"+equipe.get(i).getProjets().get(i).getNom());
        }
    }
}
