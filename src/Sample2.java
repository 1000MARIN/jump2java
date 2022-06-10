import java.util.ArrayList;
import java.util.Arrays;

public class Sample2 {
    public static void main(String[] args) {
        ArrayList<String> pocket = new ArrayList<>(Arrays.asList("paper", "handphone", "card"));

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        } else if (pocket.contains("card")){
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }

    }
}
