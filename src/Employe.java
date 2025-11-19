import java.util.ArrayList;
import java.util.List;

public class Employe {

    private String nom;
    private List<Projet> projets;

    public Employe(String nom) {
        this.nom = nom;
        this.projets = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Projet> getProjets() {
        return projets;
    }

    public void setProjets(List<Projet> projets) {
        this.projets = projets;
    }

    public void  ajouterProjet(Projet projet){
        projets.add(projet);
    }
    public void  listDesProjetsDunEmploye(){
            System.out.println("Nom d'employee: " +nom);
        for (int i = 0; i < projets.size(); i++) {
            System.out.println("Projet Nom"+projets.get(i).getNom());
        }
    }
}
