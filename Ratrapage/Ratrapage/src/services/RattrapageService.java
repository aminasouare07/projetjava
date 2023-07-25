package services;

import java.util.ArrayList;
import models.Professeur;
import models.Module;
import models.Cours;


public class RattrapageService {
    private final int N=10;
    private int nbrP;
    private Professeur[] professeurs=new Professeur[N];
    private ArrayList<Module> modules=new ArrayList<>();
    private ArrayList<Cours> cours=new ArrayList<>();

    public RattrapageService(){
        for (var i=0;i<N;i++) {
            addProfesseur(new Professeur("prof"+i+1, "prof"+i+"@gmail.com"));
        }
    }
    
    public void addProfesseur(Professeur p){
        professeurs[nbrP++]=p;
    }
    public void addModule(Module m){
        modules.add(m);
    }
    public void addCours(Cours c){
        cours.add(c);
    }

    public Professeur[] listerProfesseurs(){
        return professeurs;
    }
    public ArrayList<Module> listermodules(){
        return modules;
    }
    public ArrayList<Cours> listerCours(){
        return cours;
    }
    public ArrayList<Cours> listerCours(Module module, Professeur professeur){
        ArrayList<Cours> coursFiltre=new ArrayList<>();
        for (Cours c : cours) {
            if(c.getModule().equals(module) && c.getProfesseur().equals(professeur)){
                coursFiltre.add(c);
            }
        }
        return coursFiltre;
    }
    public Professeur findProfesseur(int id){
        for (var i=0;i<nbrP;i++) {
            if(professeurs[i].getId()==id){
                return professeurs[i];
            }
        }
        return null;
    }
    public Module findModule(int id){
        return modules.stream()
                        .filter(m->m.getId()==id)
                        .findFirst()
                        .orElse(null);
    }

}
