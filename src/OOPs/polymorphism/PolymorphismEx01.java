package OOPs.polymorphism;

/**
 * 다형성 : 하나의 객체가 여러 가지 타입을 가질 수 있는 것.
 *        같은 코드에서 여러 다른 실행 결과가 나온다.
 *        정보은닉, 상속과 더불어 객체지향 프로그래밍의 가장 큰 특징 중 하나이다.
 *        ㅁ자바에서는 이러한 다형성을 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있도록 하여 구현하고 있다.
 */
class A{
    public String x(){return "A.x";}
}

class B extends A{
    public String x(){return "B.x";}
    public String y(){return "y";}
}

class B2 extends A{
    public String x(){return "B2.x";}
}

public class PolymorphismEx01 {

    public static void main(String[] args) {
        A obj = new A();
        A obj2 = new B();
        A obj3 = new B2();

        System.out.println(obj.x());
        // System.out.println(obj2.y());    // 클래스 B를 클래스 A의 데이터 타입으로 인스턴스화 했을 경우, 클래스 A에 존재하는 맴버만이 클래스 B의 맴버가 된다.
        System.out.println(obj2.x());
        System.out.println(obj3.x());
    }
}
