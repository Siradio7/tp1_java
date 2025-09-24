package com.school.students;

import java.util.Scanner;

public class Etudiant {
    String nom;
    String prenom;
    int age;
    int[] notes;

    public Etudiant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.notes = new int[6]; // Modifié pour 6 notes au lieu de 5
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sePresenter() {
        System.out.println("Je m'appelle " + this.prenom + " " + this.nom + " et j'ai " + this.age + " ans.");
    }

    public void saisirNotes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisie des 6 notes pour " + this.prenom + " " + this.nom + ":");
        
        for (int i = 0; i < this.notes.length; i++) {
            int note;
            do {
                System.out.print("Entrez la note " + (i + 1) + " (entre 0 et 20): ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Veuillez entrer un nombre entier valide.");
                    System.out.print("Entrez la note " + (i + 1) + " (entre 0 et 20): ");
                    scanner.next();
                }
                note = scanner.nextInt();
                
                if (note < 0 || note > 20) {
                    System.out.println("La note doit être comprise entre 0 et 20.");
                }
            } while (note < 0 || note > 20);
            
            this.notes[i] = note;
        }
        System.out.println("Toutes les 6 notes ont été saisies avec succès.");
    }

    public double calculerMoyenne() {
        if (this.notes == null || this.notes.length == 0) {
            return 0.0;
        }
        
        int sommeDenotes = 0;
        int nombreDeNotes = 0;
        
        for (int note : this.notes) {
            sommeDenotes += note;
            nombreDeNotes++;
        }
        
        return (double) sommeDenotes / nombreDeNotes;
    }

    public int[] getNotes() {
        return this.notes.clone(); // Retourner une copie pour éviter la modification externe
    }

    public void setNotes(int[] notes) {
        if (notes != null && notes.length == 6) {
            // Valider que toutes les notes sont entre 0 et 20
            for (int note : notes) {
                if (note < 0 || note > 20) {
                    throw new IllegalArgumentException("Toutes les notes doivent être comprises entre 0 et 20.");
                }
            }
            this.notes = notes.clone();
        } else {
            throw new IllegalArgumentException("Le tableau de notes doit contenir exactement 6 éléments.");
        }
    }

    public void afficherNotes() {
        System.out.print("Notes de " + this.prenom + " " + this.nom + ": ");
        for (int i = 0; i < this.notes.length; i++) {
            System.out.print(this.notes[i]);
            if (i < this.notes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" - Moyenne: " + String.format("%.2f", calculerMoyenne()));
    }

    public void ajouterNote(int index, int note) {
        if (index < 0 || index >= this.notes.length) {
            throw new IllegalArgumentException("L'index doit être compris entre 0 et " + (this.notes.length - 1));
        }
        if (note < 0 || note > 20) {
            throw new IllegalArgumentException("La note doit être comprise entre 0 et 20.");
        }
        this.notes[index] = note;
    }

    public boolean aMoyenneSuffisante() {
        return calculerMoyenne() >= 10.0;
    }

    public String getMention() {
        double moyenne = calculerMoyenne();
        if (moyenne >= 16) {
            return "Très Bien";
        } else if (moyenne >= 14) {
            return "Bien";
        } else if (moyenne >= 12) {
            return "Assez Bien";
        } else if (moyenne >= 10) {
            return "Passable";
        } else {
            return "Insuffisant";
        }
    }
}
