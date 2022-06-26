class Calculator {
    Integer value;

    Calculator() {
        this.value = 0;
    }
    void add(int val) {
        this.value += val;
    }

    public Integer getValue() {
        return this.value;
    }
}
public class Sp5_1 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(8);     // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());
    }
}
