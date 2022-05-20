package Test;


class Animal {
    public void setName(String name) {
        this.name = name;
    }

    static String name;
}

class Dog extends Animal{
    void sleep(){
        System.out.println(super.name+" zzz");
    }
}

class HouseDog extends Dog {
    void sleep(){
        System.out.println(name+" zzz in house");
    }

    void sleep(int hour){
        System.out.println(name+" zzz in house for " + hour + " hours");
    }

}

public class Test {
    public static void main(String[] args){
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(10);
    }
}