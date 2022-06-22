interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());

    }

    int LEG_COUNT = 4;  // 인터페이스 상수

    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable {
    void bark();
}

interface BarkablePredator extends Predator, Barkable {

}

class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator, Barkable{
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements Barkable{
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper {
    void feed(Predator predator) {    //육식 동물이 오면 사과를 전져 준다.
        System.out.println("feed " + predator.getFood());
    }

}

class Bouncer {
    void barkAnimal (Barkable animal) {
        animal.bark();
    }
}
public class Sample4 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);

    }

}
