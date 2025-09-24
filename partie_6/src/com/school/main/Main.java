package com.school.main;

import com.school.students.Etudiant;

public class Main {
    public static void main(String[] args) {
        Etudiant p1 = new Etudiant("Dupont", "Jean", 30);
        Etudiant p2 = new Etudiant("Martin", "Alice", 25);

        p1.sePresenter();
        p2.sePresenter();
    }
}
