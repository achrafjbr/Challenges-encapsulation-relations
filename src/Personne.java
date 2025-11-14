public class Personne {

    private String nom;
    private int age;
    private Passeport passeport;


    public Personne(String nom, Passeport passeport, int age) {
        this.nom = nom;
        this.passeport = passeport;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Passeport getPasseport() {
        return passeport;
    }

    public void setPasseport(Passeport passeport) {
        this.passeport = passeport;
    }



    public void  assignerPasseport(Passeport p){
        this.passeport = p;
    }

    public void afficherInfos() {
        String passNumber = passeport.getNumero();
        String passNationalite = passeport.getNationalite();
        int passDateExpiration = passeport.getDateExpiration();
        System.out.println("Personne --> nom: "+this.nom+", "+this.age+"\nPassport de cette personne --> Numero: "+passNumber+", Nationality "+passNationalite+", Date Expiration: "+passDateExpiration+"   ");
    }
}
