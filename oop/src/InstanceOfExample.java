public class InstanceOfExample {
    public static void main(String[] args) {
        Animal2 animal = new Animal2();
        System.out.println(animal instanceof Object); //true
        System.out.println(animal instanceof Animal2); //true
        System.out.println(animal instanceof Bat2); //false

        Animal2 cat = new Cat2();
        System.out.println(cat instanceof Object); //true
        System.out.println(cat instanceof Animal2); //true
        System.out.println(cat instanceof Cat2); //true
        System.out.println(cat instanceof Bat2); //false
    }
}

class Animal2 {};
class Bat2 extends Animal2{};
class Cat2 extends Animal2{};