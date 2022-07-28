package abstraction.abstract_class.design_pattern.template_method_pattern;

public class MannualCar extends Car {

    @Override
    public void drive() {
        System.out.println("사람이 운전합니다.");
    }

    @Override
    public void stop() {
        System.out.println("브레이크를 밟고 정지합니다.");
    }
}
