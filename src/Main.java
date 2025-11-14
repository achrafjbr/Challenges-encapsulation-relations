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
        Instructeur instructeur = new Instructeur(1,"Nour","IT");

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

        instructeur.afficherCours();
    }


}