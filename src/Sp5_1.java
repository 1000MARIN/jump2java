interface Predator1 {
    String bark();
}

abstract class Animal1 {
    public String hello() {
        return "hello";
    }
}

class Dog extends Animal1 {
}

class Lion1 extends Animal1 implements Predator1 {
    public String bark() {
        return "Bark bark!!";
    }
}
public class Sp5_1 {
    public static void main(String[] args) {
        Animal1 a = new Lion1();
        Lion1 b = new Lion1();
        Predator1 c = new Lion1();

        System.out.println(a.hello());
        System.out.println(b.bark());
        System.out.println(b.hello());
        System.out.println(c.bark());
    }
}
