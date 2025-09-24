package com.school.main;

import com.school.students.Etudiant;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Démonstration de la classe Etudiant ===\n");
        
        Etudiant etudiant1 = new Etudiant("Dupont", "Jean", 20);
        Etudiant etudiant2 = new Etudiant("Martin", "Alice", 19);

        // Présentation des étudiants
        etudiant1.sePresenter();
        etudiant2.sePresenter();
        
        System.out.println("\n=== Test des nouvelles fonctionnalités ===");
        
        // Tester avec des notes prédéfinies
        try {
            // Définir des notes pour l'étudiant 1 (6 notes maintenant)
            int[] notesEtudiant1 = {15, 12, 18, 14, 16, 13};
            etudiant1.setNotes(notesEtudiant1);
            
            // Définir des notes pour l'étudiant 2
            int[] notesEtudiant2 = {8, 11, 9, 12, 10, 7};
            etudiant2.setNotes(notesEtudiant2);
            
            // Afficher les notes et moyennes
            System.out.println();
            etudiant1.afficherNotes();
            System.out.println("Mention: " + etudiant1.getMention());
            System.out.println("A une moyenne suffisante: " + (etudiant1.aMoyenneSuffisante() ? "Oui" : "Non"));
            
            System.out.println();
            etudiant2.afficherNotes();
            System.out.println("Mention: " + etudiant2.getMention());
            System.out.println("A une moyenne suffisante: " + (etudiant2.aMoyenneSuffisante() ? "Oui" : "Non"));
            
            // Tester l'ajout d'une note individuelle
            System.out.println("\n=== Test modification d'une note ===");
            System.out.println("Modification de la note 6 d'Alice de " + etudiant2.getNotes()[5] + " à 15");
            etudiant2.ajouterNote(5, 15);
            etudiant2.afficherNotes();
            System.out.println("Nouvelle mention: " + etudiant2.getMention());
            
        } catch (Exception e) {
            System.err.println("Erreur: " + e.getMessage());
        }
        
        System.out.println("\n=== Information importante ===");
        System.out.println("Problème résolu: La classe peut maintenant gérer 6 notes au lieu de 5.");
        System.out.println("Solution: Modification de la taille du tableau dans le constructeur (ligne 15).");
        System.out.println("Toutes les méthodes s'adaptent automatiquement à cette nouvelle taille.");
        
        // Pour tester la saisie interactive, décommentez les lignes suivantes:
        // System.out.println("\n=== Saisie interactive (décommentée) ===");
        // etudiant1.saisirNotes();
        // etudiant1.afficherNotes();
    }
}
