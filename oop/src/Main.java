//메서드 오버라이딩 예시2


public class Main {
    public static void main(String[] args) {
        Bike_ bike = new Bike_(); // 각각의 타입으로 선언 + 각각의 타입으로 객체 생성
        Car_ car = new Car_();
        MotorBike motorBike = new MotorBike();

        bike.run();
        car.run();
        motorBike.run();

        Vehicle_ bike2 = new Bike_(); // 상위 클래스 타입으로 선언 + 각각 타입으로 객체 생성
        Vehicle_ car2 = new Car_();
        Vehicle_ motorBike2 = new MotorBike();

        bike2.run();
        car2.run();
        motorBike2.run();
    }
}

class Vehicle_ {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike_ extends Vehicle_ {
    void run() {
        System.out.println("Bike is running");
    }
}

class Car_ extends Vehicle_ {
    void run() {
        System.out.println("Car is running");
    }
}

class MotorBike extends Vehicle_ {
    void run() {
        System.out.println("MotorBike is running");
    }
}
