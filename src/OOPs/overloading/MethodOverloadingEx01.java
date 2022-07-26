package OOPs.overloading;

/**
 * 오버로딩 : 동일한 이름을 가진 메서드를 두 개 이상 가질 수 있도록 하는 기능. 이름은 같지만 매개변수가 다른 여러 메서드가 있는 경우.
 */
class Adder {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {  // 타입은 같고, 매개변수의 수가 다른 경우
        return a + b + c;
    }

    double add(double a, double b) {    // 타입은 다르고, 매개변수의 수가 같은 경우
        return a + b;
    }
}

public class MethodOverloadingEx01 {

    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("11 + 22 = " + adder.add(11, 22));
        System.out.println("11 + 22 + 33 = " + adder.add(11, 22, 33));
        System.out.println("11.4 + 3.14 = " + adder.add(11.4, 3.14));
    }
}
