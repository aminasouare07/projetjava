package models;

import java.util.ArrayList;

public class Professeur {
    private static int nbr;
    private int id;
    private String nom;
    private String mail;
    private ArrayList<Module> modules=new ArrayList<>();

    public Professeur(){
        this.id=++nbr;
    }
    public Professeur(String nom,String mail){
        this.id=++nbr;
        this.nom=nom;
        this.mail=mail;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public ArrayList<Module> getModules() {
        return modules;
    }
    public void addModules(Module module) {
        this.modules.add(module);
        module.addProfesseurs(this);
    }
    @Override
    public String toString() {
        return "id:" + id + ", nom:" + nom + ", mail:" + mail;
    }
    
}
