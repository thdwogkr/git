//인터페이스 상속 예제 1

interface Animall {
    public abstract void cry();
}

interface Pett {
    void play();
}

class Dogg implements Animall, Pett {
    public void cry() {
        System.out.println("멍멍!");
    }

    public void play() {
        System.out.println("원반 던지기");
    }
}

class Catt implements Animall, Pett {
    public void cry() {
        System.out.println("야옹~!");
    }

    public void play() {
        System.out.println("쥐 잡기");
    }
}




public class InterfaceEx1 {
    public static void main(String[] args) {
        Dogg dog = new Dogg();
        Catt cat = new Catt();

        dog.cry();
        dog.play();
        cat.cry();
        cat.play();
    }

}
