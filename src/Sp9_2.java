import java.util.HashMap;
import java.util.HashSet;

public class Sp9_2 {
    public static void main(String[] args) {
        // 맵에서 값 추출하기
        HashMap<String, Integer> a = new HashMap<>();
        a.put("A", 90);
        a.put("B", 80);
        System.out.println(a.getOrDefault("C", 70)); // null 출력

    }
}
