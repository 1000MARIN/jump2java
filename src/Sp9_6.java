import java.util.Scanner;

public class Sp9_6 {
    public static void main(String[] args) {
        // 입력 숫자의 총합 구하기
        // 사용자로부터 다음과 같은 숫자를 입력받아 입력받은 숫자의 총합을 구하는 프로그램을 작성하시오. (단 숫자는 콤마로 구분하여 입력한다.)
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        String[] numbers = userInput.split(",");
        int total = 0;
        for (String num : numbers) {
            num = num.trim();               // 숫자 문자의 공백을 제거한다.
            int n = Integer.parseInt(num);  // 숫자 문자를 정수로 변환한다.
            total += n;
        }
        System.out.printf("총합은 %d 입니다. \n", total);
    }
}
