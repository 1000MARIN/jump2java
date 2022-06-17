public class Sample3 {
    int a;  // 객체변수 a

    void varTest() {
        this.a++;
    }
    public static void main(String[] args) {
        Sample3 sample3 = new Sample3();
        sample3.a = 1;
        sample3.varTest();
        System.out.println(sample3.a);
    }
}
