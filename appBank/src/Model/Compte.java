package Model;

public class Compte {
	   // Attribut Compte Bancaire
    private int numCompte;
    private double solde;
    private double decouvert;
    private String prenomTitulaire;
    private String nomTitulaire;
    public double decouvertMax;
    public double debitMax;
    private double debitAutorise;
    private double retraitSolde;
     
     
     
     
     
    // Constructeur création Compte bancaire
    public CompteBancaire(int numCompte, String nomTitulaire, String prenomTitulaire) {
        super();
        this.numCompte = numCompte;
        this.nomTitulaire = nomTitulaire;
        this.prenomTitulaire = prenomTitulaire;
    }
     
     
    //Constructeur affectation découvert
     
    public CompteBancaire(int numCompte, String nomTitulaire, String prenomTitulaire, float decouvertMax) {
        this(numCompte, nomTitulaire, prenomTitulaire);
        this.decouvertMax = decouvertMax;
         
    }
     
    //Constructeur affectation debit max
     
        public CompteBancaire(int numCompte, String nomTitulaire, String prenomTitulaire, float decouvertMax, float debitMax) {
            this(numCompte, nomTitulaire, prenomTitulaire, decouvertMax);
            this.debitMax = debitMax;
             
        }
    // Fonction vérification découvert
        public double montantDecouvert(){
            if (solde<0){
                return -solde;
            }
            else
            {
                return 0;
            }
        }
 
    // Fonction ajouter de l'argent au compte
        public void ajoutArgent(double montant)
        {
            solde = montant+solde ;
        }
         
         
    // Fonction retirer de l'argent au compte
        public void retraitArgent(double montant){
            retraitSolde = solde - montant;
    if(montant <= debitMax && retraitSolde <= decouvertMax && montant>0)
        {
        solde = retraitSolde;
        System.out.println("Voici votre argent, votre solde restant est " + solde);
        }
    else
        {
        System.out.println("Retrait impossible");
        }
    }
     

//Getters and Setters
public int getNumCompte() {
    return numCompte;
}
public void setNumCompte(int numCompte) {
    this.numCompte = numCompte;
}
public double getSolde() {
    return solde;
}
public void setSolde(float solde) {
    this.solde = solde;
}
public double getDecouvert() {
    return decouvert;
}
public void setDecouvert(float decouvert) {
    this.decouvert = decouvert;
}
public String getNomTitulaire() {
    return nomTitulaire;
}
public void setNomTitulaire(String nomTitulaire) {
    this.nomTitulaire = nomTitulaire;
}
public String getPrenomTitulaire() {
    return prenomTitulaire;
}
public void setPrenomTitulaire(String prenomTitulaire) {
    this.prenomTitulaire = prenomTitulaire;
}
public double getDecouvertMax() {
    return decouvertMax;
}
public void setDecouvertMax(float decouvertMax) {
    this.decouvertMax = decouvertMax;
}
public double getDebitMax() {
    return debitMax;
}
public void setDebitMax(float debitMax) {
    this.debitMax = debitMax;
}
public double getDebitAutorise() {
    return debitAutorise;
}
public void setDebitAutorise(float debitAutorise) {
    this.debitAutorise = debitAutorise;

     
}

*/fin
