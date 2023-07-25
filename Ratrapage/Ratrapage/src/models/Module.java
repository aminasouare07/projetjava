package models;
import java.util.ArrayList;


public class Module {
    private static int nbr;
    private int id;
    private int coeficient;
    private String libelle;
    private ArrayList<Professeur> professeurs=new ArrayList<>();

    public Module(int coef, String libelle){
        this.id=++nbr;
        this.coeficient=coef;
        this.libelle=libelle;
    }

    public Module(){
        this.id=++nbr;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCoeficient() {
        return coeficient;
    }
    public void setCoeficient(int coeficient) {
        this.coeficient = coeficient;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public ArrayList<Professeur> getProfesseurs() {
        return professeurs;
    }
    public void addProfesseurs(Professeur professeur) {
        this.professeurs.add(professeur);
    }

    @Override
    public String toString() {
        return "id:" + id + ", coeficient:" + coeficient + ", libelle:" + libelle;
    }
}
