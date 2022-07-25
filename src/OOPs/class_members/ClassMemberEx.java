package OOPs.class_members;

/**
 * 멤버타입 비교
 * 1. 인스턴스 메소드는 클래스 멤버에 접근할 수 있다.
 * 2. 클래스 메소드는 인스턴스 멤버에 접근할 수 없다.
 *  ➡ 인스턴스 변수는 인스턴스가 만들어지면서 생성되는데, 클래스 메소드는 인스턴스가 생성되기 전에 생성되기 때문에 클래스 메소드가 인스턴스 멤버에 접근하는 것은 존재하지 않는 인스턴스 변수에 접근하는 것과 같다.
 */

class C1 {
    static int static_variable = 1;
    int instace_variable = 2;

    static void static_static() {
        System.out.println(static_variable);
    }

    static void static_instance() {
        // 클래스 메소드에서는 인스턴스 변수(멤버)에 접근할 수 없다.
        // System.out.println(instace_variable);   // Non-static field 'instace_variable' cannot be referenced from a static context
    }

    void instance_static() {
        // 인스턴스 메소드에서는 클래스 변수(멤버)에 접근할 수 있다.
        System.out.println(static_variable);
    }

    void instance_instance() {
        System.out.println(instace_variable);
    }
}

public class ClassMemberEx {

    public static void main(String[] args) {
        C1 c = new C1();    // C1 객체 생성

        // 인스턴스를 이용해서 정적 메소드에 접근 ➡ 성공
        // 인스턴스 메소드가 정적 변수에 접근 ➡ 성공
        c.static_static();

        // 인스턴스를 이용해서 정적 메소드에 접근 ➡ 성공
        // 정적 메소드가 인스턴스 변수에 접근 ➡ 실패
        c.static_instance();

        // 인스턴스를 이용해서 인스턴스 메소드에 접근 ➡ 성공
        // 인스턴스 메소드가 클래스 변수에 접근 ➡ 성공
        c.instance_static();

        // 인스턴스를 이용해서 인스턴스 메소드에 접근 ➡ 성공
        // 인스턴스 메소드가 인스턴스 변수에 접근 ➡ 성공
        c.instance_instance();

        // 클래스를 이용해서 클래스 메소드에 접근 ➡ 성공
        // 클래스 메소드가 클래스 변수에 접근 ➡ 성공
        C1.static_static();

        // 클래스를 이용해서 클래스 메소드에 접근 ➡ 성공
        // 클래스 메소드가 인스턴스 변수에 접근 ➡ 실패
        C1.static_instance();

        // 클래스를 이용해서 인스턴스 메소드에 접근  ➡ 실패
        // 아직 인스턴스는 생성되지 않았는데, 인스턴스 메소드에 접근하려 하기때문에
        // C1.instace_static();    // Cannot resolve method 'instace_static' in 'C1'

        // 클래스를 이용해서 인스턴스 메소드에 접근  ➡ 실패
        // C1.instace_instace();
    }
}
