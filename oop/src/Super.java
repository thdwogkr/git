//Super 키워드 예시

public class Super {

        public static void main(String[] args) {
        Lower l = new Lower();
        l.callNum();
    }
}

    class Upper {
        int count = 20; // super.count
    }

    class Lower extends Upper {
        int count = 15; // this.count

        void callNum() {
            System.out.println("count = " + count);
            System.out.println("this.count = " + this.count);
            System.out.println("super.count = " + super.count);
        }
    }


