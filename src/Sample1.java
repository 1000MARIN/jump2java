import java.util.*;

public class Sample1 {
    public static void main(String[] args) {
        // 1. 홍길동 씨의 과목별 점수는 각각 다음과 같다. 홍길동 씨의 평균 점수를 구해 보자.
//        int a = 80;
//        int b = 75;
//        int c = 55;
//        System.out.println((a + b + c) / 3);


        // 2. 자연수 13이 홀수인지 짝수인지 판별할 수 있는 방법에 대해서 말해 보자.
//        System.out.println(13%2);

        // 3. 홍길동씨의 주민등록번호는 881120-1068234이다. 홍길동씨의 주민등록번호를 연월일(YYYYMMDD) 부분과 그 뒤의 숫자 부분으로 나누어 출력해 보자.
//        String pin = "881120-1068234";
//        String yyyyMMdd = pin.substring(0, 6);
//        String num = pin.substring(7);
//        System.out.println(yyyyMMdd);
//        System.out.println(num);

        // 4. 주민등록번호 뒷자리의 맨 첫 번째 숫자는 성별을 나타낸다. 주민등록번호에서 성별을 나타내는 숫자를 출력해 보자.
//        String pin = "881120-1068234";
//        if (Integer.parseInt(String.valueOf(pin.charAt(7))) == 1) {
//            System.out.println("남자");
//        } else {
//            System.out.println("여자");
//        }

        // 5. 다음과 같은 문자열 a:b:c:d가 있다. 문자열의 replace 함수를 사용하여 a#b#c#d로 바꿔서 출력해 보자.
//        String a = "a:b:c:d";
//        String b = a.replaceAll(":", "#");
//        System.out.println(b);

        // 6. [1, 3, 5, 4, 2]라는 리스트를 [5, 4, 3, 2, 1]로 만들어보자.
//        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
//        num.sort(Comparator.reverseOrder());
//        System.out.println(num);

        // 7. 다음과 같은 ['Life', 'is', 'too', 'short'] 리스트를 "Life is too short" 문자열로 만들어 출력해 보자.
//        ArrayList<String> myList = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
//        String result = String.join(" ", myList);
//        System.out.println(result);

        // 8. 다음의 맵 grade 에서 "B'에 해당되는 값을 추출해 보자. (추출하고 나면 grade 에는 "B"에 해당하는 아이템이 사라져야 한다.)
////        HashMap<String, Integer> grade = new HashMap<>();
////        grade.put("A", 90);
////        grade.put("B", 80);
////        grade.put("C", 70);
////        System.out.println(grade.remove("B"));
//        System.out.println(grade);

        // 9. 다음의 numbers 리스트에서 중복 숫자를 제거해 보자.
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
//        HashSet<Integer> temp = new HashSet<>(numbers);     // List 를 Set 으로 변경
//        ArrayList<Integer> result = new ArrayList<>(temp);  // Set 을 다시 List 로 변경
//        System.out.println(result);                         // [1, 2, 3, 4, 5]

        // 10. 다음은 커피의 종류(1: 아메리카노, 2:아이스 아메리카노, 3:카페라떼)를 입력하면 커피의 가격을 알려주는 프로그램이다.
        // 위 메소드에서 1, 2, 3과 같은 매직넘버를 제거하여 프로그램을 개선해보자.

        printCoffeePrice(CoffeeType.AMERICANO);    // "가격은 3000원 입니다." 출력
    }

    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    static void printCoffeePrice(CoffeeType type) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
        priceMap.put(CoffeeType.CAFE_LATTE, 5000);
        int price = priceMap.get(type);
        System.out.printf("가격은 %d원 입니다.", price);
    }
}