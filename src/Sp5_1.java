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

    int avg(int[] data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total / data.length;
    }

    int avg(ArrayList<Integer> data) {
        int total = 0;
        for (int num : data) {
            total += num;
        }
        return total / data.size();
    }
}


public class Sp5_1 {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        int[] data1 = {1, 3, 5, 7, 9};
        int result1 = cal.avg(data1);
        System.out.println(result1);    // 5 출력

        ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int result2 = cal.avg(data2);
        System.out.println(result2);


    }
}
