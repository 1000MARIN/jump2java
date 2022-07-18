public class Sp9_1 {
    public static void main(String[] args) {
        // 문자열 바꾸기
        String a = "a:b:c:d";
        String[] temp = a.split(":");             // ":" 로 분리
        String result = String.join("#", temp); // "#" 으로 합침
        System.out.println(result);                     // "a#b#c#d" 출력
    }
}
