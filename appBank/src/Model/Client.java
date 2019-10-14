package Model;

public class Client {
	   
    // Attributs du Client
    private String nom;
    private String adresse;
     
     
     
    // Constructeur
        public Client(String nom, String adresse) {
            super();
            this.nom = nom;
            this.adresse = adresse;
        }
         
         
     
    // Getters et Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
    	
        this.adresse = adresse;
    }
}