import java.util.Random;

class OddException extends Exception {
}
public class Sp9_10 {
    static void execute(int n) {    // execute 메서드내에서 OddException을 직접 처리했다.
        System.out.printf("입력 숫자: %d\n", n);
        try {
            if (n % 2 == 1) {   // 홀수이면 OddException이 발생한다.
                throw new OddException();
            }
            System.out.println("짝수입니다.");
        } catch (OddException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        /*
        오류에 상관없이 모두 수행하기
        다음은 Random 클래스를 사용하여 0~10 사이의 숫자를 무작위로 생성한 후 그 숫자로 execute 함수를 10회 호출하는 프로그램이다.
        execute 함수는 입력 숫자가 짝수인 경우에는 "짝수입니다." 를 출력하지만 홀수인 경우에는 OddException을 발생시킨다.
        이 프로그램은 10회의 execute 메서드 호출 시 입력 숫자가 홀수인 경우 프로그램이 즉시 종료된다.
        OddException이 발생하더라도 프로그램이 종료되지 않고 10회 모두 호출될 수 있도록 프로그램을 수정하시오.
        ※ Random 클래스의 nextInt(범위) 메서드는 범위내의 정수 중 임의의 정수(난수)를 리턴한다.
         */

        Random r = new Random();
        r.setSeed(System.currentTimeMillis());
        for (int i = 0; i < 10; i++) {
            execute(r.nextInt(10));
        }
    }
}
