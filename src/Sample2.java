import java.util.ArrayList;
import java.util.Arrays;

public class Sample2 {
    public static void main(String[] args) {
        // 1. 다음 코드의 출력 결과는 무엇일까? (눈으로 해석하고 풀어보자.)
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }

        // 2. while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해 보자.
    }
}

