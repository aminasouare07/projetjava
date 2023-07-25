package models;

public class Cours {
    static private int nbr;
    private int id;
    private String date;
    private String heureDb;
    private String heureFin;
    private Professeur professeur;
    private Module module;

    public Cours(){
        this.id=++nbr;
    }
    public Cours(String date, String heureDb, String heureFin){
        this.id=++nbr;
        this.date=date;
        this.heureDb=heureDb;
        this.heureFin=heureFin;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getHeureDb() {
        return heureDb;
    }
    public void setHeureDb(String heureDb) {
        this.heureDb = heureDb;
    }
    public String getHeureFin() {
        return heureFin;
    }
    public void setHeureFin(String heureFin) {
        this.heureFin = heureFin;
    }
    public Professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }
    public Module getModule() {
        return module;
    }
    public void setModule(Module module) {
        this.module = module;
    }
    @Override
    public String toString() {
        return "id:" + id + ", date:" + date + ", heureDb:" + heureDb + ", heureFin:" + heureFin
                + ", professeur:" + professeur.getNom() + ", module:" + module.getLibelle();
    }
    


}
