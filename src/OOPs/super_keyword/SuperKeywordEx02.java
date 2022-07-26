package OOPs.super_keyword;

class Animal2 {
    void eat() {
        System.out.println("먹는다");
    }
}

class Dog2 extends Animal2 {
    void eat() {    // 메소드 재정의
        System.out.println("사료를 먹는다.");
    }

    void bark() {
        System.out.println("짖는다.");
    }

    void work() {
        super.eat();
        bark();
    }
}
public class SuperKeywordEx02 {

    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.eat();
        dog.work();
    }
}
