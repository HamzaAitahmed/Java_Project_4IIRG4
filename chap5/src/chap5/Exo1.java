package chap5;

import java.util.Comparator;

public class Exo1 {

    public static void main(String[] args) {
        TableauDesEmployes tableau = new TableauDesEmployes();
        tableau.remplir();

        System.out.println("Liste initiale des employés : ");
        tableau.afficher();

        System.out.println("\nListe des employés après tri par ordre alphabétique des noms : ");
        
        tableau.trier(new CmpNom());
     
        tableau.afficher();

        System.out.println("\nSomme des salaires des employés : " + tableau.calculerSalaires());
        System.out.println("Moyenne des salaires des employés : " + tableau.calculerMoyenne());

        Employe nouvelEmploye = new Employe("Nouveau", "Employe", "NE1234", 30000);
        try {
            tableau.ajouter(nouvelEmploye, 2);
            System.out.println("\nListe des employés après l'ajout d'un nouvel employé : ");
            tableau.afficher();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        tableau.afficherSalaireMaxMin();

        Employe[] copieEmployes = tableau.copie(1, 4);
        System.out.println("\nCopie des employés de position 1 à 4 : ");
        for (Employe emp : copieEmployes) {
            System.out.println(emp);
        }

        Employe employeASupprimer = tableau.EmplPlusGrandSalaire();
        tableau.supprimer(employeASupprimer);
        System.out.println("\nListe des employés après la suppression de l'employé avec le plus grand salaire : ");
        tableau.afficher();

        tableau.inverser();
        System.out.println("\nListe des employés après l'inversion de l'ordre : ");
        tableau.afficher();

        Employe[] tableau2 = tableau.copie(0, tableau.employes.length);
        System.out.println("\nNouveau tableau de copie : ");
        for (Employe emp : tableau2) {
            System.out.println(emp);
        }
    }
}
