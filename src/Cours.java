import java.util.ArrayList;
import java.util.List;

public class Cours {

    private int id;
    private String titre;
    private String description;
    private List<Etudiant> inscrits;

    public Cours(int id, String titre, String description) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.inscrits = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public List<Etudiant> getInscrits() {
        return inscrits;
    }

    public void setInscrits(List<Etudiant> inscrits) {
        this.inscrits = inscrits;
    }

    public void ajouterEtudiant(Etudiant e){
        inscrits.add(e);
    }

    public void etudiantsDunCours(){
        for (Etudiant etudiant:getInscrits() ){
            System.out.println("Id: "+ etudiant.getId());
            System.out.println("Nom: "+ etudiant.getNom());
        }
    }


}
