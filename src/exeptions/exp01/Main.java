package exeptions.exp01;

//-----------------------------
// Hierarchie des exceptions
//-----------------------------

/*
En Java, la hiérarchie part de Throwable :
Throwable
├── Error
└── Exception
    ├── RuntimeException
    └── (autres exceptions "checked")

Error : erreurs graves de la JVM (ex: OutOfMemoryError) → en général on ne les gère pas.
Exception : problèmes applicatifs.
RuntimeException : exceptions non vérifiées (unchecked) (ex: NullPointerException, IllegalArgumentException).
autres sous-classes de Exception : exceptions vérifiées (checked) (ex: IOException, SQLException) → il faut try/catch ou throws.
Astuce pour retenir :
Checked = le compilateur t’oblige à traiter.
Unchecked (RuntimeException) = le compilateur ne t’oblige pas.
 */


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//-----------------------------
// gestion des exceptions
//-----------------------------

//public class Main {
//    public static void main(String[] args) {
//        try {
//            FileReader fileReader = new FileReader("src/file.txt"); // FileNotFoundException (checked)
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//}


//-----------------------------
// gestion de plusieurs exceptions
//-----------------------------
//public class Main {
//    public static void main(String[] args) {
//        FileReader fileReader = null;
//        try {
////            FileReader fileReader = new FileReader("src/file.txt"); // FileNotFoundException (checked)
//            fileReader.read(); // IOException (checked)
//            new SimpleDateFormat().parse("");
//        }
//        catch (IOException | ParseException e) {
//            e.printStackTrace();
//        } finally {
//
//            if (fileReader != null) {
//                try {
//                    fileReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}

//-----------------------------
// Bloc finaly
//-----------------------------
//public class Main {
//    public static void main(String[] args) {
//        try {
//            System.out.println("Dans try");
//            int x = 10 / 0; // force ArithmeticException
//            System.out.println("x = " + x);
//        } catch (ArithmeticException e) {
//            System.out.println("Dans catch: " + e.getMessage());
//        } finally {
//            System.out.println("Dans finally: ce bloc s'exécute toujours");
//        }
//
//        System.out.println("Fin du programme");
//    }
//}


//-----------------------------
// Remarques try-catch-finally
//-----------------------------

//public class Main {
//    public static void main(String[] args) {
//        Main main = new Main();
//        System.out.println(main.quiz());
//    }

//    String quiz (){
//        try {
//            return "try";
//        } catch (Exception e) {
//            return "catch";
//        } finally {
//            return "finally";
//        }
//    }
//}


//-----------------------------
    // Instruction try-with-resources
//-----------------------------
    // Permet de gérer automatiquement la fermeture des ressources (ex: fichiers, connexions, etc.) qui implémentent l'interface AutoCloseable.
    // La ressource est fermée automatiquement à la fin du bloc try, même en cas d'exception.
    // Syntaxe :
    // try (ResourceType resource = new ResourceType()) {
    //     // utilisation de la ressource
    // } catch (ExceptionType e) {
    //     // gestion de l'exception
    // }

//public class Main {
//    public static void main(String[] args) {
//        try (
//                FileReader fileReader = new FileReader("src/file.txt");
//                FileWriter fileWriter = new FileWriter("src/file_copy.txt")
//
//        ) { // FileNotFoundException (checked)
//           fileReader.read(); // IOException (checked)
//       } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}


//-----------------------------
// Lancement d'une exception
//-----------------------------

//public class Main {
//    public static void main(String[] args) {
//        try {
//            MyBankApp.start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}


//-----------------------------
// Creation d'exceptions
//-----------------------------

public class Main {
    public static void main(String[] args) {
            MyBankApp.start();
    }
}