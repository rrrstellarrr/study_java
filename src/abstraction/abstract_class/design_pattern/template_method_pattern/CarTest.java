package abstraction.abstract_class.design_pattern.template_method_pattern;

public class CarTest {

    public static void main(String[] args) {
        System.out.println("====== AI 자동차 ======");
        Car aiCar = new AICar();    // AICar와 MannalCar 인스턴스를 상위클래스인 Car를 타입으로 하여 생성
        aiCar.run();

        System.out.println("====== 일반 자동차 ======");
        Car mannualCar = new MannualCar();
        mannualCar.run();
    }
}
