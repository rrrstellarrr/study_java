package abstraction.abstract_class;

/**
 * 추상클래스 : 하나 이상의 추상 메소드를 포함하는 클래스를 가리켜 추상 클래스(abstract class)라고 한다.
 */
abstract class Bike {
    abstract void run();        // 추상메소드 : 추상으로 선언되고 구현이 없는 메소드
}
public class AbstractClassEx01 extends Bike {

    @Override
    void run() {
        System.out.println("자전거가 달린다. 따르릉~");
    }

    public static void main(String[] args) {
        Bike bike = new AbstractClassEx01();
        bike.run();
    }
}
