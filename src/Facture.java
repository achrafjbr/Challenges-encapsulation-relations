import java.util.ArrayList;
import java.util.List;

public class Facture {
    private int id;
    private List<Paiement> paiements;

    public Facture(int id) {
        this.id = id;
        this.paiements = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }

    public void ajouterPaiement(Paiement paiement) {
        paiements.add(paiement);
    }

    public double calculerTotalPaiements() {
        double total = 0;
        for (Paiement paiement : getPaiements()) {
            total += paiement.getMontant();
        }
        return total;
    }

    public void payerLaFacture(double pay){
        double total = calculerTotalPaiements();
        total-=pay;
        if (total==0){
            System.out.println("La Facture est payée :");
        }else{
            System.out.println("Le reste est egale :"+total);
        }

    }
}
