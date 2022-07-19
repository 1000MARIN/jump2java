public class Sp9_4 {
    static int fib(int n) {
        if (n == 0) {   // n이 0일 때는 0을 반환
            return 0;
        } else if (n == 1) {    // n이 1일 때는 1을 반환
            return 1;
        } else {    // n이 2 이상일 때는 그 이전의 두 값을 더하여 반환
            return fib(n - 2) + fib(n - 1);
        }
    }


    public static void main(String[] args) {
        // 피보나치 함수
        // 입력을 정수 n으로 받았을 때, n 이하까지의 피보나치 수열을 출력하는 프로그램을 작성해 보자.

//        fib(0) → 0 반환
//        fib(1) → 1 반환
//        fib(2) → fib(0) + fib(1) → 0 + 1 → 1 반환
//        fib(3) → fib(1) + fib(2) → 1 + 1 → 2 반환
//        fib(4) → fib(2) + fib(3) → 1 + 2 → 3 반환

        for (int i = 0; i < 10; i++) {
            System.out.println(fib(i));   // 순서대로 0 1 1 2 3 5 8 13 21 34 출력
        }


    }
}
