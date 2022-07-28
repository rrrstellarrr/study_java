package abstraction.java_interface;

/**
 * 인터페이스 : 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상 클래스.
 *           오로지 추상 메소드와 상수만을 포함할 수 있다.
 *
 * 문법 : 접근제어자 interface 인터페이스 이름 {
 *          public static final 타입 상수이름 = 값;
 *          ...
 *          public abstract 메소드이름(매개변수);
 *      }
 *      클래스와는 달리 인터페이스의 모든 필드는 public static final이어야 하며, 모든 메소드는 public abstract이어야 한다.
 *      제어자는 생략할 수 있다.(이렇게 생략된 제어자는 컴파일 시 자바 컴파일러가 자동으로 추가해 준다.)
 */
interface Animal {
    // public abstract void cry();
    public void cry();
}

class Cat implements Animal {

    @Override
    public void cry() {
        System.out.println("아옹야옹~!");
    }
}

class Dog implements Animal {

    @Override
    public void cry() {
        System.out.println("멍멍!!!");
    }
}

public class InterfaceEx01 {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.cry();
        dog.cry();
    }
}
