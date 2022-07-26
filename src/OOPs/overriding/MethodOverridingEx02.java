package OOPs.overriding;

/**
 * Dynamic Method Dispatch : dynamic은 runtime의 동의어로 사용되며, dispatch는 어떤 메소드를 호출할지 결정하는 것이다.
 *                          동적 메서드 디스패치에서 개체는 자식 클래스의 재정의 메서드와 기본 클래스의 재정의되지 않은 모든 메서드를 호출할 수 있지만 자식 클래스에서 새로 선언된 메서드는 호출할 수 없다.
 */
class SuperClass {
    void call() {
        System.out.println("부모클래스 호출");
    }
}

class Sub1Class extends SuperClass {
    @Override
    void call() {
        System.out.println("자식1클래스 호출");
    }
}

class Sub2Class extends SuperClass {
    @Override
    void call() {
        System.out.println("자식2클래스 호출");
    }

    void newCall() {
        System.out.println("자식2클래 새로운 호출");
    }
}

public class MethodOverridingEx02 {

    public static void main(String[] args) {
        SuperClass superClass = new SuperClass();
        System.out.println("================");
        superClass.call();

        // Sub1Class sub1 = new SuperClass();  // 다운캐스팅 필요
        SuperClass sub1 = new Sub1Class();     // 업캐스팅(자식 클래스 객체가 부모 클래스 타입으로 형변환)
        System.out.println("================");
        sub1.call();

        SuperClass sub2 = new Sub2Class();
        System.out.println("================");
        sub2.call();
        // sub2.newCall();                        // sub2는 Sub2Class 객체를 가리키지만, SuperClass 타입이기 때문에 SuperClass 클래스의 멤버에만 접근이 가능하디.

        Sub2Class sub3 = new Sub2Class();
        System.out.println("================");
        sub3.call();
        sub3.newCall();
    }
}
