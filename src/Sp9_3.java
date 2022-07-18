import java.util.Arrays;

public class Sp9_3 {
    public static void main(String[] args) {
        // 50점 이상 점수의 총합 구하기
        int[] A = {20, 55, 67, 82, 45, 33, 90, 87, 100, 25};

        // 방법 1
//        int total = 0;
//        for (int a : A) {
//            if (a >= 50) {
//                total += a;
//            }
//        }
//        System.out.println(total);  // 481 출력

        // 방법 2
        int total = Arrays.stream(A).filter((a) -> a >= 50).sum();
        System.out.println(total);  // 481 출력
    }
}
