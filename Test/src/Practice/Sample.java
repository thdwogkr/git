package Practice;


import java.util.ArrayList;
import java.util.Arrays;

class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }

    boolean isOdd(int val) {
        if( val%2==0) {
            return false;
        }
        return true;
    }

    int avg(int[] arr) {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++ ) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}

class UpgradeCalculator extends Calculator {
    void minus(int val) {
        this.value -= val;
    }
}

class MaxlimitCalculator extends Calculator {
    void add(int val) {
        this.value += val;
        if(this.value >100) {
            this.value = 100;
        }
    }
}


public class Sample {
    public static void main(String[] args) {
        int[] data = {1,3,5,7,9};
        Calculator cal = new Calculator();
        System.out.println(cal.avg(data));

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1,3,5,7,9));
       // System.out.println((cal.avg(data2)));

    }


}
