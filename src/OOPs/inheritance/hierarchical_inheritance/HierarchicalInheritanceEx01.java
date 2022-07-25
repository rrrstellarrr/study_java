package OOPs.inheritance.hierarchical_inheritance;

/**
 * 계층 상속
 *  : 둘 이상의 클래스가 단일 클래스를 상속하는 경우 이를 계층적 상속 이라고 한다.
 */
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

class Cat extends Animal {
    void meow() {
        System.out.println("야옹야옹~~!!");
    }
}

public class HierarchicalInheritanceEx01 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.bark();
        dog.eat();
        cat.meow();
        cat.eat();
    }
}
