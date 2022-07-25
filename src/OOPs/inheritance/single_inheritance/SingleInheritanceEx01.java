package OOPs.inheritance.single_inheritance;

// 단일 상속 예제
class Animal {
    void eat() {
        System.out.println("먹이를 먹는다. 옴뇸뇸옴뇸뇸");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("짖는다. 왈왈왈!!");
    }
}

public class SingleInheritanceEx01 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
