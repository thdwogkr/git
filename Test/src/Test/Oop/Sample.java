package Test.Oop;

interface  Predator{
    String getFood();
    void barkAnimal();

}

class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator {
    public String getFood() {
        return "apple";
    }
    public void barkAnimal() {
        System.out.println("어흥");
    }
}
class Lion extends Animal implements Predator {
    public String getFood() {
        return "banana";
    }

    public void barkAnimal() {
        System.out.println("으르렁");
    }
}


class Zookeeper {
    void feed(Predator predator) {
        System.out.println(predator.getFood());
    }

}

class Bouncer {
    void barkAnimal(Predator predator) {
        predator.barkAnimal();
    }
}

public class Sample {
    public static void main(String[] args){
//        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);



    }
}


