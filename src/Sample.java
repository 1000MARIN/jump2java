import java.util.*;

public class Sample {
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {
        for (CoffeeType type : CoffeeType.values()) {
            System.out.println(type);   // 순서대로 출력
        }

    }
}