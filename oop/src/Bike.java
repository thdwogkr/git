//메서드 오버라이딩 예시


class Vehicle {
        void run() {
        System.out.println("Vehicle is running");
        }
        }

public class Bike extends Vehicle { // Vehicle 클래스 상속
    void run() {
        System.out.println("Bike is running"); // 메서드 오버라이딩
    }

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}

//Output
