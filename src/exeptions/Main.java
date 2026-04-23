package exeptions;

//-----------------------------
// Exceptions
//-----------------------------

// Les types d'exceptions = checked, unchecked, errors
// checked = exceptions qui doivent être gérées (try/catch ou throws)
// unchecked = exceptions qui ne sont pas obligatoires à gérer (RuntimeException et ses sous-classes)
// errors = erreurs graves qui ne peuvent pas être gérées (OutOfMemoryError, StackOverflowError, etc.)


import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        // FileReader fileReader = new FileReader("test.txt"); // FileNotFoundException (checked)
        sayHello(null); //
    }
    public static void sayHello(String text){
        System.out.println("Hello " + text.toUpperCase());
    }
}
