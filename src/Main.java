import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Nombre total de mots
        int totalMots = 0;

        try {
            // Ouvrir le fichier texte.txt
            File fichier = new File("test.txt");
            Scanner lecteur = new Scanner(fichier);

            System.out.println("Compteur de mots");

            // Lire chaque ligne du fichier
            while (lecteur.hasNextLine()) {
                String ligne = lecteur.nextLine();

                // Séparer les mots avec l'espace
                String[] mots = ligne.split(" ");

                // Compter les mots de cette ligne
                int motsDansLigne = mots.length;
                totalMots += motsDansLigne;

                System.out.println("Ligne :" + ligne );
                System.out.println("Nombre de mots dans cette ligne : " + motsDansLigne);
            }

            lecteur.close();

            // Afficher le total
            System.out.println("Nombre Total de mots dans le fichier : " + totalMots);

        } catch (FileNotFoundException e) {
            System.out.println("Erreur : fichier non trouvé ");
        }
    }
}
