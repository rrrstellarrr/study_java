package OOPs.inheritance.multilevel_inheritance;

/**
 * 다단계 상속
 *  : 상속 체인이 있는 경우 이를 다단계 상속 이라고 한다.
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

class BabyDog extends Dog{
    void weep() {
        System.out.println("운다. 멍멍...");
    }
}

public class MultilevelInheritanceEx01 {

    public static void main(String[] args) {
        BabyDog baby = new BabyDog();
        baby.weep();
        baby.bark();
        baby.eat();
    }
}
