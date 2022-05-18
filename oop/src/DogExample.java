//추상클래스 예제 1

abstract class Animal {
    public String kind;
    abstract public void sound();   //sound() 뒤에 바디가 없는 경우 abstract 안붙이면 에러 발생
}


class Dog extends Animal {
    public Dog() {
        this.kind = "포유류";
    }

    public void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    public Cat() {
        this.kind = "포유류";
    }

    public void sound() {
        System.out.println("야옹");
    }
}

public class DogExample {
    public static void main(String[] args)  {
        Animal dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }

}