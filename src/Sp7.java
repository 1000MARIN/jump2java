import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

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
        BinaryOperator<Integer> mc = (a, b) -> a + b;
        int result = mc.apply(3, 4);
        System.out.println(result);     // 7 출력
    }
}
