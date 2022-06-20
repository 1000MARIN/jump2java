class Animal {
    String name;

    void setName(String name) { // setName : 메소드, name : 객체 변수
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {  // sleep : 메소드
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog {

    HouseDog(String name) {
        this.setName(name);
    }
    void sleep() {  // sleep : 메소드
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) { // sleep: 메소드, hour : 객체 변수
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
}

public class Sample4 {
    public static void main(String[] args) {
        HouseDog dog = new HouseDog("happy");
        System.out.println(dog.name);   // null 출력

        int a = 1;
    }
}
