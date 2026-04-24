package collections;


public class Main {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
       var iterator = list.iterator();
       list.add(1);
       list.add(2);
       list.add(3);
       //[1,2,3]
     while(iterator.hasNext()){
         System.out.println(iterator.next());
     }
    }
}
