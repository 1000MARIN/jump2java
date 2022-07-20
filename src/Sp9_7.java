import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class Sp9_7 {
    public static void main(String[] args)  throws IOException {
        /*
         *역순 저장
         * 다음과 같은 내용의 파일 abc.txt가 있다.
         * AAA
         * BBB
         * CCC
         * DDD
         * EEE
         * 이 파일의 내용을 다음과 같이 역순으로 바꾸어 result.txt 파일에 저장하시오.
         * EEE
         * DDD
         * CCC
         * BBB
         * AAA
         */
        ArrayList<String> lines = new ArrayList<>();

        // 파일을 읽어 각 라인을 lines에 저장한다.
        BufferedReader br = new BufferedReader(new FileReader("C:/Users/snc/IdeaProjects/jump2java/abc.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null) break;
            lines.add(line);
        }
        br.close();

        // 역순으로 정렬 한다.
        lines.sort(Comparator.reverseOrder());

        // 정렬된 내용을 result.txt에 저장한다.
        PrintWriter pw = new PrintWriter("C:/Users/snc/IdeaProjects/jump2java/result.txt");
        for (String line : lines) {
            pw.println(line);
        }
        pw.close();

    }
}
