@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}

class MyCalculator implements Calculator {
    public int sum(int a, int b) {
        return a + b;
    }
}
public class Sp7  {
    public static void main(String[] args) {
        Calculator mc = Integer::sum;
        int result = mc.sum(3, 4);
        System.out.println(result);     // 7 출력
    }
}
