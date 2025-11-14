public class Passeport {

    private String numero;
    private String nationalite;
    private int dateExpiration;

    public Passeport(String numero, String nationalite, int dateExpiration) {
        this.numero = numero;
        this.nationalite = nationalite;
        this.dateExpiration = dateExpiration;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public int getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(int dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
}
