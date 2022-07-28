package OOPs.polymorphism.exam02;

import java.util.Scanner;

public class CalculatorTest {

    public static void excute(Calculator cal) {
        System.out.println("실행결과");
        cal.run();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();

        Calculator calPlus = new CalculatorDecoPlus();
        calPlus.setOprands(left, right);

        Calculator calMinus = new CalculatorDecoMinus();
        calMinus.setOprands(left, right);

        excute(calPlus);
        excute(calMinus);
    }
}
