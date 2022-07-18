public class Sp8_4 {
    static int getExcludeSpaceCount(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {   // 공백이 아닌 경우에만 결과값을 증가
                result ++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getExcludeSpaceCount("공백을 제외한 글자수"));            // 9 출력
        System.out.println(getExcludeSpaceCount("점프 투 자바의 연습문제 풀이"));     // 12 출력
        
    }
}
