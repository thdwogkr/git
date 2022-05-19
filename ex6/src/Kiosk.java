package TestPackage.Kimbab_one;
import java.util.Scanner;

public class Kiosk{
    static Scanner sc = new Scanner(System.in);
    static int number;

    final static int menu_1_cost = 1000;
    final static int menu_2_cost = 1500;
    final static int menu_3_cost = 1000;
    final static int menu_4_cost = 2000;

    static void input_print() {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("-".repeat(40));
    }

    static void count() {
        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        System.out.println("1) 김밥(1000원) 2) 계란 김밥(1500원) 3) 충무 김밥(1000원) 4) 떢볶이(2000원)");
        number = sc.nextInt();

        if( number<1 || number>4 ) {
            System.out.println("[안내]메뉴에 포함된 번호를 입력하여 주세요.");

            count();
        }


    }

    static void cost(int number) {
        System.out.println("-".repeat(40));
        System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
        System.out.println("( ※ 최대 주문 가능 수량 : 99");
        int count = sc.nextInt();

        if(count<1 || count > 99) {
            System.out.printf("[경고]%d개는 입력하실 수 없습니다.",count);
            System.out.println("[경고]수량 선택 화면으로 돌아갑니다.");
            cost(number);
        } else {
            int price = 0;
            if (number ==1) {
                price = menu_1_cost * count;
            } else if(number == 2) {
                price = menu_2_cost * count;
            } else if (number == 3) {
                price = menu_3_cost * count;
            } else if (number == 4) {
                price = menu_4_cost * count;
            }

            System.out.printf("[안내]주문하신 메뉴의 총 금액은 %d원 입니다.",price);
            System.out.println("[안내]이용해 주셔서 감사합니다.");
        }
    }

    public static void main(String[] args) {
        input_print();
        count();
        cost(number);

    }


}10