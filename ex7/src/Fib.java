public class Fib {

    public static void main(String[] args) {

        Fibo() ex = new Fibo();
        ex = 10;
        System.out.println(ex);



    }


    public static int Fibo(int num) {
        if (num <= 2) return 1;
        Fibo(num) = Fibo(num - 1) + Fibo(num - 2);
    }
}
