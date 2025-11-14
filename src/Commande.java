import java.util.ArrayList;
import java.util.List;

public class Commande {


    private int id;
    private List<Produit> produits;

    public Commande(int id ) {
        this.id = id;
        this.produits = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public void ajouterProduit(Produit p) {
        produits.add(p);
    }

    public void calculerTotal() {
        double total = 0;
        System.out.println("Les Commandes :");
        for (Produit produit : getProduits()) {
            System.out.println(produit.getNom());
            total += produit.getQuantite() * produit.getPrixUnitaire();
        }

        System.out.println("Le total de cette commande est: "+total);
    }
}
