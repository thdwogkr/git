import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
// good~~
public class Fib {
    public static void main(String[] args) {
        System.out.println("[안내]피보나치 수열 프로그램 시작.");
        Input a = new Input();
        a.what();
        a.cal();
        System.out.println("[안내]프로그램을 종료합니다.");
    }
}


class Input {

    int num;
    int[] sum;

    void what() {
        Scanner sc = new Scanner(System.in);
        System.out.print("원하는 수열의 개수를 입력해 주세요 : ");
        num = sc.nextInt();
        sc.close();
    }

    void cal() {
        System.out.println("[피보나치 수열 출력]");
        sum = new int[num];
        sum[0] = 1;
        sum[1] = 1;
        for(int i = 2 ; i < num ; i++ ){
            sum[i] = sum[i-1] + sum[i-2];
        }

        for(int j = 0 ; j < num ; j ++) {
            System.out.println(sum[j]);
        }


    }

}
