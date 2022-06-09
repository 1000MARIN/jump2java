import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample {
    public static void main(String[] args) {

        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("123", "153", "139"));
        pitches.sort(Comparator.naturalOrder());    // 오름차순으로 정렬
        System.out.println(pitches);                // 123,153,123 출력
    }
}