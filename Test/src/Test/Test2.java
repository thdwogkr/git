package Test;
import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String[] data = {"aa","bb","cc"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(data));
        String result = String.join("1",list);

        System.out.println(result);


    }


}
