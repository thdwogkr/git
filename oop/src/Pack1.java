//접근제어자 예시

package package1; // package1

class Test { // Test 클래스의 접근 제어자는 default
    public static void main(String[] args) {
        Pack1 p = new Pack1();

//        System.out.println(p.a); // 동일 클래스가 아니기 때문에 에러발생!
        System.out.println(p.b);
        System.out.println(p.c);
        System.out.println(p.d);
    }
}

public class Pack1 { // Parent 클래스의 접근 제어자는 public
    private int a = 1; // a,b,c,d에 각각 private, default, protected, public 접근제어자 지정
    int b = 2;
    protected int c = 3;
    public int d = 4;

    public void printEach() { // 동일 클래스이기 때문에 에러발생하지 않음
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}