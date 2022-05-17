//접근제어자 예시2

package package2; // package2

import package1.Pack1;

public class Child extends package1.Pack1 { // package1으로부터 Parent 클래스를 상속
    public void printEach() {
        // System.out.println(a); // 에러 발생!
        // System.out.println(b);
        System.out.println(c); // 다른 패키지의 하위 클래스
        System.out.println(d);
    }
}

class Test2 {
    public static void main(String[] args) {
        Pack1 p = new Pack1();

//        System.out.println(p.a); // public을 제외한 모든 호출 에러!
//        System.out.println(p.b);
//        System.out.println(p.c);
        System.out.println(p.d);
    }
}