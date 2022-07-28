package abstraction.java_interface;

/**
 * 다중삭속 : 인터페이스는 인터페이스로부터만 상속을 받을 수 있으며, 여러 인터페이스를 상속받을 수 있다.
 */
interface Example1{
    public void display1();
}

interface Example2 {
    public void display2();
}

interface Example3 extends Example1,Example2{
}

class Example4 implements Example3{
    public void display1(){
        System.out.println("display1 method");
    }
    public void display2(){
        System.out.println("display2 method");
    }
}

public class InterfaceEx02 {

    public static void main(String[] args) {
        Example4 example = new Example4();
        example.display1();
        example.display2();
    }
}
