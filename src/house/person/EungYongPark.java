package house.person;


import house.HousePark;

public class EungYongPark extends HousePark {   // HousePark 을 상속했다.
    public static void main(String[] args) {
        EungYongPark eyp = new EungYongPark();
        System.out.println(eyp.lastname);   // 상속한 클래스의 protected 변수는 접근이 가능하다.

    }
}
