package abstraction.abstract_class.design_pattern.template_method_pattern;

public abstract class Car {
    public abstract void drive();   // 각 하위 클래스에 따라 달라져야 할 구체적인 내용을 추상메소드로 작성
    public abstract void stop();

    // 공통적인 기능 - 일반 메소드
    public void startCar() {
        System.out.println("시동을 켭니다.");
    }
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {}    // 훅 메소드(Hook Method) : 구현부가 있지만 내용이 비어있는 메소드. 하위클래스에서 선택적인 오버라이딩을 할때 사용
                                // 훅 메소드는 추상메서드와 같이 상위 클래스에서 정의되고 하위클래스에서 구현하는 역할을 하지만 훅 메소드는 재정의를 하지 않아도 오류가 발생하거나 abstract를 선언해줄 필요가 없다.

    // 전체적으로 차의 움직임에 흐름을 조직하는 기능을 하는 메소드. (템플릿메소드)
    // 하위 클래스에서 재정의 할 수 없게 앞에 final 을 붙여 준다. (순서 변경X)
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
