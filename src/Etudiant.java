import java.util.ArrayList;
import java.util.List;

public class Etudiant {

    private int id;
    private String nom;
    private List<Cours> coursSuivis;

    public Etudiant(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.coursSuivis = new ArrayList<>();
    }

    public List<Cours> getCoursSuivis() {
        return coursSuivis;
    }

    public void setCoursSuivis(List<Cours> coursSuivis) {
        this.coursSuivis = coursSuivis;
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

    public void inscrire(Cours c) {
        coursSuivis.add(c);
    }

    public void coursDunEtudiant(){
        System.out.println("Les cours de  "+this.getNom()+" est : ");
         for (Cours cours:getCoursSuivis() ){
             System.out.println("Id: "+ cours.getId());
             System.out.println("Title: "+ cours.getTitre());
             System.out.println("Description: "+ cours.getDescription());
         }
    }
}
