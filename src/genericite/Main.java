package genericite;

//-----------------------------
// Classes générique
//----------------------------
//public class Main {
//    public static void main(String[] args) {
//       var myList =new GenericList<BankAccount>();
//       myList.add(new BankAccount());
//       var account = myList.get(0);
//
//    }
//}


//-----------------------------
// Généricité et types primitifs
//----------------------------
// il faut utiliser Integer, Double, etc. au lieu de
// int, double, etc. car les types primitifs ne peuvent pas être
// utilisés avec les génériques
// la généricité ne concerne que les réferences


//public class Main {
//    public static void main(String[] args) {
//        GenericList<Integer> myList = new GenericList<>();
//        myList.add(10); // Boxing
//        int value = myList.get(0); // unBoxing
//
//        System.out.println("value: " + value);
//    }
//}

//-----------------------------
// Contraintes
//----------------------------

//public class Main {
//    public static void main(String[] args) {
//       new GenericList<BankAccount>();
//    }
//}


//-----------------------------
// interface Comparable
//----------------------------
public class Main {
    public static void main(String[] args) {
       BankAccount bankAccount1 = new BankAccount(15);
       BankAccount bankAccount2 = new BankAccount(30);

        if (bankAccount1.compareTo(bankAccount2) < 0) {
            System.out.println("bankAccount1 has less balance than bankAccount2");
        } else if (bankAccount1.compareTo(bankAccount2) > 0) {
            System.out.println("bankAccount1 has more balance than bankAccount2");
        } else {
            System.out.println("bankAccount1 and bankAccount2 have the same balance");
        }
    }
}

