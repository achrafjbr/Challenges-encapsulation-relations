import java.util.ArrayList;
import java.util.List;

public class Instructeur {

   private int id;
    private  String nom;
    private String specialisation;
    private List<Cours> coursEnseignes;

    public Instructeur(int id, String nom, String specialisation) {
        this.id = id;
        this.nom = nom;
        this.specialisation = specialisation;
        this.coursEnseignes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public List<Cours> getCoursEnseignes() {
        return coursEnseignes;
    }

    public void setCoursEnseignes(List<Cours> coursEnseignes) {
        this.coursEnseignes = coursEnseignes;
    }

    public void  ajouterCours(Cours c){
        coursEnseignes.add(c);
    }

    public void afficherCours(){
        System.out.println("Les cours de ce prof:" + nom);
        for (Cours cours : coursEnseignes){
            System.out.println("Courses --> Id: "+cours.getId()+", Title: "+cours.getTitre()+" Description "+cours.getDescription()+" ");
        }
    }
}
