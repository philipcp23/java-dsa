public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 6,6);
        Dog dog = new Dog("Pit bull", 8, 80, 2, 4, 1, 1, "short brindle");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
