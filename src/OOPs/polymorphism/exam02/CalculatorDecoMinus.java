package OOPs.polymorphism.exam02;

public class CalculatorDecoMinus extends Calculator {

    @Override
    public void sum() {
        System.out.println("- sum :" + _sum());
    }

    @Override
    public void avg() {
        System.out.println("- avg :" + (this.left + this.right) / 2);
    }
}
