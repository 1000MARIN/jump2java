public class GuGu {
    public void dan(int n) {
        System.out.println(n * 1);
        System.out.println(n * 2);
        System.out.println(n * 3);
        System.out.println(n * 4);
        System.out.println(n * 5);
        System.out.println(n * 6);
        System.out.println(n * 7);
        System.out.println(n * 8);
        System.out.println(n * 9);
    }

    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i < 10; i++) {
            GuGu guGu = new GuGu();
            guGu.dan(i);
        }

    }
}
