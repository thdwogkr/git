//인터페이스 상속 예제2

abstract class Animalll {public abstract void cry();} //추상 클래스
interface Pettt {public abstract void play();}

class Doggg extends Animalll implements Pettt {
    public void cry() {
        System.out.println("멍멍!");
    }

    public void play() {
        System.out.println("원반 던지기");
    }
}

class Cattt extends Animalll implements Pettt {
    public void cry() {
        System.out.println("야옹~!");
    }

    public void play() {
        System.out.println("쥐 잡기");
    }
}

public class InterfaceEx2 {
    public static void main(String[] args) {

    Doggg dog = new Doggg();
    Cattt cat = new Cattt();

    dog.cry();
    dog.play();
    cat.cry();
    cat.play();
  }
}
