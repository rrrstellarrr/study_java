package abstraction.abstract_class;

abstract class Shape {  // 추상클래스

    Shape() {
        System.out.println("모양을 고르자!");
    }

    abstract void draw(); // 추상 메서드에는 본문(구현코드)가 없다. 구현 클래스에서 재정의 해야한다.

    void changeShape() {
        System.out.println("모양을 바꾸자!");
    }
}

class Rectangle extends Shape { // 구체클래스

    @Override
    void draw() {   // 재정의
        System.out.println("직사각형을 그리자!");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("동그라미를 그리자!");
    }
}

public class AbstractClassEx02 {

    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        shape1.draw();
        shape1.changeShape();

        Shape shape2 = new Circle();
        shape2.draw();
        shape2.changeShape();
    }
}
