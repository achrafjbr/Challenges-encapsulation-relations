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


        /// Challenge 4 — One-to-Many : Commande et Produit.

       // Commande commande = new Commande(1);

        //commande.ajouterProduit( new Produit(2,10,"Coffee"));
        //commande.ajouterProduit( new Produit(2,1000,"PC"));

        // commande.calculerTotal();



        /// Challenge 8 — One-to-Many + Calcul : Facture et Paiement
       // Paiement paiement1 = new Paiement(100,"1/1/1992");
       // Paiement paiement2 = new Paiement(200,"1/10/1992");

       // Facture facture =new Facture(1);
       // facture.ajouterPaiement(paiement1);
       // facture.ajouterPaiement(paiement2);
       // System.out.println(facture.calculerTotalPaiements()); //  montant corrant
       // facture.payerLaFacture(100);


        ///  Challenge 5 — One-to-One : Voiture et CarteGrise

        //CarteGrise carteGrise1 =  new CarteGrise(23222,new Proprietaire(14,"Achraf"),"1/1/1956");
        //Voiture voiture1 = new Voiture(1113,"Toyota",3333);
        //voiture1.lierCarteGrise(carteGrise1);
        //voiture1.afficherLaliaison();

        /// Challenge 6 — One-to-Many : Bibliothèque et Livre

       // Livre livre1 = new Livre("la crime double","Agata christie",2222);
       // Livre livre2 = new Livre("Le drole","Albert kami",32);

        //Bibliotheque bibliotheque = new Bibliotheque("Ahmed hansali");

        //bibliotheque.ajouterLivre(livre1);
        //bibliotheque.ajouterLivre(livre2);
        //bibliotheque.afficherLivres();
        //bibliotheque.supprimerLivre(livre1);
        //bibliotheque.afficherLivres();

        ///  Challenge 7 — Many-to-Many : Auteur et Livre
        // Livre livre1 = new Livre("la crime double","Agata christie",2222);
        //  Livre livre2 = new Livre("Le drole","Albert kami",32);

        // Auteur auteur1 =  new Auteur("Agata christie");
        //  Auteur auteur2 =  new Auteur("Albert kami");

        // livre1.ajouterAuteur(auteur1);
        // livre1.ajouterAuteur(auteur1);

        // livre1.afficherLesAuteurDunLive();

        // auteur1.ajouterLivre(livre1);
        // auteur1.ajouterLivre(livre2);

        // auteur1.afficherLesLivresDunAuteur();

        ///  Challenge 9 — One-to-One : Étudiant et Certification:

        //Etudiant etudiant1 =  new Etudiant(100,"Achraf");
        //Certification certification = new Certification("Java","1/10/2022");

        //etudiant1.attribuerCertification(certification);
        //Etudiant etudiant2 =  new Etudiant(100,"Achraf");
        //etudiant2.attribuerCertification(certification);
        //etudiant2.attribuerCertification(certification);


        ///  Challenge 10 — Many-to-Many : Projet et Employé








    }
}
