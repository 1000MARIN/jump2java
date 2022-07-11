public class Sp8_2 {
    static int getDigitCount(int n) {
        int count = 0;
        while (true) {
            if (n == 0) {
                break;
            }
            n = n / 10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getDigitCount(3));
        System.out.println(getDigitCount(25));
        System.out.println(getDigitCount(333));
        System.out.println(getDigitCount(7876));

    }
}
