package OOPs.inheritance;

/**
 * 상속 : 어떤 객체가 있을 때, 그 객체의 필드(변수)와 메소드를 다른 객체가 물려받을 수 있는 기능.
 * 특진 : 1. 기존에 작성된 클래스를 재활용할 수 있다.
 *       2. 자식 클래스 설계 시 중복되는 멤버를 미리 부모 클래스에 작성해 놓으면, 자식 클래스에서는 해당 멤버를 작성하지 않아도 된다.
 *       3. 클래스 간의 계층적 관계를 구성함으로써 다형성의 문법적 토대를 마련한다.
 *
 * 문법 : class 하위클래스 extends 상위클래 {
 *          // 메서드, 필드
 *      }
 */

class Employee {
    float salary = 40000;
}

public class InheritanceEx extends Employee {
    int bonus = 10000;

    public static void main(String[] args) {
        InheritanceEx ex = new InheritanceEx();

        System.out.println("월급 : " + ex.salary);
        System.out.println("보너스 : " + ex.bonus);
    }
}
