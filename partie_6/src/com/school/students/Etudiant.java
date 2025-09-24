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
        this.notes = new int[6];
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
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez saisir les notes de l'étudiant !");
        for(int i = 0; i < this.notes.length; i++) {
            System.out.println("Note " + i + 1 + " : ");
            int note;

            do {
                note = sc.nextInt();
            } while (note < 0 || note > 20);

            this.notes[i] = note;
        }
    }

    public double calculerMoyenne() {
        double moyenne = 0;

        for (int note : this.notes) {
            moyenne += (double) note;
        }

        return moyenne/this.notes.length;
    }
}
