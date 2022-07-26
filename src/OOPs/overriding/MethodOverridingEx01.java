package OOPs.overriding;

/**
 * 오버라이딩 : 하위 클래스(자식 클래스)가 상위 클래스에서 선언된 것과 동일한 메소드를 갖는 경우 이를 Java에서 메소드 오버라이드(overriding, 재정의)라고 한다.
 */
class Human {
    void eat() {
        System.out.println("먹는다.");
    }
}

class Boy extends Human {
    @Override
    void eat() {        // 메소드 재정의
        System.out.println("소년이 먹는다.");
    }
}

public class MethodOverridingEx01 {

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.eat();
    }
}
