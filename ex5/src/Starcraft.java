import java.util.Random;
import java.util.Scanner;

public class Starcraft {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Unit mine = new Unit();
        Unit enemy = new Unit();


        System.out.println("[안내] TRPG 스타크래프트 시작합니다.");
        System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");

        String[] mine2 = mine.unit_create();
        mine.user_print(mine2);

        String[] enemy2 = enemy.unit_create();
        enemy.user_print(enemy2);

        int[] mine_int = mine.unit_info_int(mine2);
        int[] enemy_int = enemy.unit_info_int(enemy2);
        Random rnd = new Random();

        for(int i = 0; i<1;) {
            if (mine_int[2] < 1) {
                System.out.println("[안내] 체력이 0으로 게임이 종료됩니다.");
                System.out.println("[안내] 나의 유닛이 제거되었습니다.");
                i++;
            } else if (enemy_int[2] < 1) {
                System.out.println("[안내] 체력이 0으로 게임이 종료됩니다.");
                System.out.println("[안내] 적의 유닛이 제거되었습니다.");
                i++;
            } else {
                System.out.print("[시스템] 공격 1, 필살기 2, 방어 3, 회피 4 :");
                String choice = scanner.nextLine();
                int randomInt = rnd.nextInt(3);
                System.out.println(randomInt);
                if (choice.equals("1")) {
                    if (randomInt == 0) {
                        mine.attack(mine_int, enemy_int);
                        mine.hpcheck(mine_int, enemy_int);
                        enemy.attack(enemy_int, mine_int);
                        enemy.hpcheck(enemy_int, mine_int);
                    } else if (randomInt == 1) {
                        enemy.special(enemy_int, mine_int);
                        enemy.hpcheck(enemy_int, mine_int);
                    } else if (randomInt == 2) {
                        enemy.defend();
                    } else {
                        mine.attack(mine_int, enemy_int);
                        mine.hpcheck(mine_int, enemy_int);
                    }
                } else if (choice.equals("2")) {
                    if (randomInt == 0) {
                        mine.special(mine_int, enemy_int);
                        mine.hpcheck(mine_int, enemy_int);
                    } else if (randomInt == 1) {
                        mine.special(mine_int, enemy_int);
                        mine.hpcheck(mine_int, enemy_int);
                        enemy.special(enemy_int, mine_int);
                        enemy.hpcheck(enemy_int, mine_int);
                    } else if (randomInt == 2) {
                        mine.special(mine_int, enemy_int);
                        mine.hpcheck(mine_int, enemy_int);
                    } else {
                        enemy.avoid();
                    }
                } else if (choice.equals("3")) {
                    if (randomInt == 0) {
                        mine.defend();
                    } else if (randomInt == 1) {
                        enemy.special(enemy_int, mine_int);
                        enemy.hpcheck(enemy_int, mine_int);
                    } else if (randomInt == 2) {
                        mine.defend();
                        enemy.defend();
                    } else {
                        mine.defend();
                        enemy.avoid();
                    }

                } else if (choice.equals("4")) {
                    if (randomInt == 0) {
                        enemy.attack(enemy_int, mine_int);
                        enemy.hpcheck(enemy_int, mine_int);
                    } else if (randomInt == 1) {
                        mine.avoid();
                    } else if (randomInt == 2) {
                        mine.avoid();
                        enemy.defend();
                    } else {
                        mine.avoid();
                        enemy.avoid();
                    }
                }
            }
        }

    }
}

class Unit{
    String name, attack, defence, hp;
    Scanner scanner = new Scanner(System.in);

    void user_info(String name, String attack, String defence, String hp) {
        this.name = name;
        this.attack = attack;
        this.defence = defence;
        this.hp = hp;
    }

    String[] unit_create() {
        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 : ");
        String name = scanner.nextLine();
        System.out.print("[시스템] 유닛 [공격력] 을 입력해 주세요 : (Ex 50)");
        String attack = scanner.nextLine();
        System.out.print("[시스템] 유닛 [방어력] 을 입력해 주세요 : (Ex 1)");
        String defence = scanner.nextLine();
        System.out.print("[시스템] 유닛 [체력] 을 입력해 주세요 : (Ex 100)");
        String hp = scanner.nextLine();

        user_info(name, attack, defence, hp);

        return new String[] {name, attack, defence, hp};
    }

    void user_print(String[] user) {
        System.out.println();
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.printf("[안내] %s 유닛이 게임에 참여하였습니다.%n",user[0]);
        System.out.printf("[공격력] : %s%n", user[1]);
        System.out.printf("[방어력] : %s%n",user[2]);
        System.out.printf("[체력] : %s%n",user[3]);
        System.out.println("=".repeat(40));
    }

    int[] unit_info_int(String[] info) {
        int[] info_int = new int[3];
        info_int[0] = Integer.parseInt(info[1]);
        info_int[1] = Integer.parseInt(info[2]);
        info_int[2] = Integer.parseInt(info[3]);

        return info_int;
    }



    void attack(int[] attacker, int[] defencer) {
        System.out.println("-".repeat(40));
        System.out.printf("[안내] [%s]유닛이 [공격] 하였습니다.%n",name);

        defencer[2] = defencer[2] - attacker[0]/defencer[1];

    }

    void special(int[] attacker, int[] defencer) {
        System.out.println("-".repeat(40));
        System.out.printf("[안내] [%s]유닛이 [필살기] 사용 하였습니다.%n",name);
        defencer[2] = defencer[2] - attacker[0]/defencer[1]*3/2;
    }

    void hpcheck(int[] attacker, int[] defencer) {
        if(defencer[2] >=0) {
            System.out.printf("[안내] 상대 유닛의 남은 [체력]은 %d 입니다.%n",defencer[2]);
        } else {
            System.out.println("[안내] 상대 유닛의 남은 [체력]은 0 입니다.");
        }
    }

    void defend() {
        System.out.printf("[안내] %s가 상대의 공격을 막았다.%n",name);
    }

    void avoid() {
        System.out.printf("[안내] %s가 상대의 공격을 피했다.%n",name);
    }

}