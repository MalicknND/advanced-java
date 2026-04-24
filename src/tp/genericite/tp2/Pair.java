package tp.genericite.tp2;

// Gérer plusieurs types de données dans une même classe
public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void display(){
        System.out.println(key + " : " + value);
    }
}
