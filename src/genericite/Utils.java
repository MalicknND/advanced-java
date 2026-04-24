package genericite;
//-----------------------------
// methode générique
//----------------------------
//public class Utils {
//    public static <T extends Comparable<T>> T min(T first, T second){
//        return (first.compareTo(second) < 0) ? first : second;
//    }
//}


//-----------------------------
// paramètre à type multiples
//----------------------------
public class Utils {
    public static <T extends Comparable<T>> T min(T first, T second){
        return (first.compareTo(second) < 0) ? first : second;
    }

    // methode avec deux paramètres à type différents
    public static <K, V> void printKeyValue(K key, V value){
        System.out.println("key: " + key + ", value: " + value);
    }
}



