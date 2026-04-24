package tp.genericite.tp2;

// Crée une classe générique pour encapsuler
// une valeur de n'importe quel type
public class Box<T> {
    private T value;

    public void set(T value){
        this.value = value;
    }
    public T get(){
        return value;
    }
}
