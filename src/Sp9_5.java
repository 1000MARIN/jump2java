import java.util.Scanner;

public class Sp9_5 {
    public static void main(String[] args) {
        // 한 줄 구구단
        // 사용자로부터 2~9의 숫자 중 하나를 입력받아 해당 숫자의 구구단을 한 줄로 출력하는 프로그램을 작성하시오.

        /*
         * 구구단을 출력할 숫자를 입력하세요(2~9): 2
         * 2 4 6 8 10 12 14 16 18
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 출력할 숫자를 입력하세요(2~9):");
        int num = sc.nextInt(); // 사용자로부터 숫자를 입력받는다.
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d ", i * num);  // 뒤에 공백을 포함하여 구구단의 숫자를 출력한다.
        }
    }
}
