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
        this.notes = new int[5];
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
}
