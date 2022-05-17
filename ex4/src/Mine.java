import java.util.HashMap;
import java.util.Scanner;

public class Mine {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);                       // Scanner
        HashMap<String,String> user = new HashMap<String,String>();     // 로그인 정보
        user.put("admin","0000");// id user, pw 0000 생성

        HashMap<String,String> reply = new HashMap<String,String>();
        reply.put("안녕","반가워!");
        reply.put("하이","반가워!");
        reply.put("ㅎㅇ","반가워!");
        reply.put("헬로","반가워!");
        reply.put("졸려","나도 졸려ㅠ");
        reply.put("피곤해","나도 피곤해 ㅠ");
        reply.put("배고파","나도 배고파 ㅠ");
        reply.put("안녕","반가워");



        System.out.println("=".repeat(20));
        System.out.println("안녕? 나는 심심이야");
        System.out.println("=".repeat(20));
        System.out.println();
        System.out.println("[심심이] : ID가 뭐야? (admin) ");
        String id = scanner.nextLine();
        System.out.println("[심심이] : PW는 뭐야? (0000) ");
        String pw = scanner.nextLine();

        if(user.containsKey(id)==false || user.get(id).equals(pw)==false) {
            System.out.println("[심심이] : 저런... ID나 PW를 다시 알아 오렴");
        }  else {
            System.out.println("[심심이] : 반가워!");
            for(int i = 0; i<1 ; ) {
                System.out.println("심심에게 하고 싶은 말을 적어주세요. *종료 하고 싶으면 bye라고 말해주세요.");
                String send = scanner.nextLine();
                if(reply.containsKey(send)==true) {
                    System.out.printf("[심심이] : %s%n",reply.get(send));
                } else if (send.equals("bye")==true) {
                    System.out.println("[심심이] : 다음에 봐!");
                    i++;
                } else {
                    System.out.println("[심심이] : 미안... 모르는 말이야 ㅠㅠ");
                }

            }


        }







    }
}
