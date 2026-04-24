package tp.genericite.tp2;

public class Utils {

    // Méthode générique pour afficher n'importe quel type de données
    public static <T> void print(T value){
        System.out.println(value);
    }
}
