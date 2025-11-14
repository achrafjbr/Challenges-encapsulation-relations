import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ///  Challenge 1 — One-to-One : Passeport et Personne
        //Passeport passeport = new Passeport("EAb19","Egyptien",2027);
        //Personne personne = new Personne("Ahmad",passeport,32);
        //personne.assignerPasseport(passeport);
        //personne.afficherInfos();

        ///  Challenge 2 — One-to-Many : Instructeur et Cours
        Instructeur instructeur = new Instructeur(1, "Nour", "IT");

        //Cours java = new Cours(1, "Java", "Java cours description");
        //Cours html = new Cours(2, "Html", "Html cours description");
        //Cours css = new Cours(3, "Css", "Css cours description");
        //Cours jpa = new Cours(4, "Jpa", "Jpa cours description");
        //Cours hibernate = new Cours(5, "Hibernate", "Hibernate cours description");
        //Cours oracle = new Cours(6, "Oracle", "Oracle cours description");

        //instructeur.ajouterCours(java);
        //instructeur.ajouterCours(html);
        //instructeur.ajouterCours(css);
        //instructeur.ajouterCours(jpa);
        //instructeur.ajouterCours(hibernate);
        //instructeur.ajouterCours(oracle);

        // instructeur.afficherCours();

        /// Challenge 3 — Many-to-Many : Étudiant et Cours

        List<Cours> coursSuivis = new ArrayList<>();
        List<Etudiant> inscrits = new ArrayList<>();
        Etudiant Jack = new Etudiant(1, "Jack");
        Etudiant manal = new Etudiant(13, "Manal");
        Etudiant nour = new Etudiant(10, "Nour");
        Cours java = new Cours(1, "Java", "Java cours description");
        Cours springBoot = new Cours(2, "Spring Boot", "Spring Boot cours description");


        ////// --------------------- Les cours d'un etudiant...--------------
        //coursSuivis.add(java);
        //coursSuivis.add(springBoot);

        //Jack.setCoursSuivis(coursSuivis);
        //manal.setCoursSuivis(coursSuivis);

        //Jack.coursDunEtudiant();
        //manal.coursDunEtudiant();

        //// --------------------- Les etudiants d'un cours...--------------

       // inscrits.add(nour);
       // inscrits.add(Jack);

        //java.setInscrits(inscrits);
        //springBoot.ajouterEtudiant(nour);
        //springBoot.ajouterEtudiant(manal);

        //springBoot.etudiantsDunCours();





    }


}
