
import java.util.Scanner;

import models.Professeur;
import models.Module;
import models.Cours;
import services.RattrapageService;

public class App {
    private static Scanner scanner=new Scanner(System.in);
    private static RattrapageService rattrapageService=new RattrapageService();
    public static void main(String[] args) throws Exception {
        int choix,coef,chModule,chProf;;
        String lib, heureDb,heureFin,date;
        Professeur p;
        Module m;
        Cours cours;
        do{
            System.out.println("1-Ajouter un Module");
            System.out.println("2-Lister les Modules");
            System.out.println("3-Créer un cours");
            System.out.println("4-Lister les  tous les cours");
            System.out.println("5-Lister les cours  d’un module et d’un professeur");
            System.out.println("6-Quitter");
            System.out.print("Faites votre choix : ");
            choix=scanner.nextInt();

            scanner.nextLine();
            switch(choix){
                case 1:
                    System.out.println("Entrer le libelle : ");
                    lib=scanner.nextLine();
                    System.out.println("Entrer le coeficient : ");
                    coef=scanner.nextInt();
                    m=new Module(coef,lib);
                    rattrapageService.addModule(m);
                break;

                case 2:
                    for (Module module : rattrapageService.listermodules()) {
                        System.out.println(module);
                    }
                break;

                case 3:
                    System.out.println("Entrer la date: ");
                    date=scanner.nextLine();
                    System.out.println("Entrer l'heure de debut: ");
                    heureDb=scanner.nextLine();
                    System.out.println("Entrer l'heure de fin: ");
                    heureFin=scanner.nextLine();
                    do {
                        System.out.println("Entrer l'id du module: ");
                        chModule=scanner.nextInt();
                        m=rattrapageService.findModule(chModule);
                    } while (m==null);
                    
                    do {
                        System.out.println("Entrer l'id du professeur: ");
                        chProf=scanner.nextInt();
                        p=rattrapageService.findProfesseur(chProf);
                    } while (p==null);
                    cours=new Cours(date, heureDb, heureFin);
                    cours.setModule(m);
                    cours.setProfesseur(p);
                    rattrapageService.addCours(cours);
                break;
                case 4:
                    for (Cours c : rattrapageService.listerCours()) {
                        System.out.println(c);
                    }
                break;

                case 5:
                    do {
                        System.out.println("Entrer l'id du module: ");
                        chModule=scanner.nextInt();
                        m=rattrapageService.findModule(chModule);
                    } while (m==null);
                    do {
                        System.out.println("Entrer l'id du professeur: ");
                        chProf=scanner.nextInt();
                        p=rattrapageService.findProfesseur(chProf);
                    } while (p==null);
                    
                    for (Cours c : rattrapageService.listerCours(m,p)) {
                        System.out.println(c);
                    }
                break;
                
            }
        }while(choix!=6);
    }
 
}
