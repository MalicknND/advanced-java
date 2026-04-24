package tp.genericite.tp2;

public class Main {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.set("Hello");

        Box<Integer> box2 = new Box<>();
        box2.set(123);

        System.out.println("Box1 value: " + box1.get()); // Box1 value: Hello
        System.out.println("Box2 value: " + box2.get()); // Box2 value: 123

        Pair<String, Integer> pair1 = new Pair<>("Age", 30);
        Pair<String, String> pair2 = new Pair<>("Name", "Alice");
        System.out.print("Pair1: ");
        pair1.display(); // Pair1: Age : 30
        System.out.print("Pair2: ");
        pair2.display(); // Pair2: Name : Alice


        Utils.print("Generic method with String"); // Generic method with String
        Utils.print(456); // 456
        Utils.print(3.14); // 3.14



        Repository<User> userRepo = new Repository<>();
        userRepo.add(new User("Alice"));
        userRepo.add(new User("Bob"));
        System.out.println(userRepo.getAll());
    }
}
