public class Sample3 {
    int sum(int a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Sample3 sample3 = new Sample3();
        int c = sample3.sum(a, b);

        System.out.println(c);
    }
}
