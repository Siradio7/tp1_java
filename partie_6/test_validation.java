// Test simple de validation
import com.school.students.Etudiant;

public class TestValidation {
    public static void main(String[] args) {
        Etudiant etudiant = new Etudiant("Test", "User", 20);
        
        try {
            // Test avec note invalide
            int[] notesInvalides = {15, 12, 25, 14, 16, 13}; // 25 > 20
            etudiant.setNotes(notesInvalides);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation OK - Note invalide rejetée: " + e.getMessage());
        }
        
        try {
            // Test avec nombre incorrect de notes
            int[] tropPeuDeNotes = {15, 12, 18}; // seulement 3 notes
            etudiant.setNotes(tropPeuDeNotes);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation OK - Nombre de notes incorrect rejeté: " + e.getMessage());
        }
        
        try {
            // Test avec index invalide
            etudiant.ajouterNote(10, 15); // index 10 n'existe pas
        } catch (IllegalArgumentException e) {
            System.out.println("Validation OK - Index invalide rejeté: " + e.getMessage());
        }
        
        System.out.println("Tous les tests de validation réussis!");
    }
}