class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}
public class Sample4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("puppy");
        System.out.println(dog.name);   // puppy 출력
        dog.sleep();
    }

}
