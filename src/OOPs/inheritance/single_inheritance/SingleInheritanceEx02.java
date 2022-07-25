package OOPs.inheritance.single_inheritance;

class Calcuator {
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calcuator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class SingleInheritanceEx02 {

    public static void main(String[] args) {
        SubstractionableCalculator sc = new SubstractionableCalculator();
        sc.setOprands(10, 20);      // Calcuator 클래스를 상속 받았기 때문에 SubstractionableCalculator는 Calcuator에서 정의한 메소드들을 사용할 수 있다.
        sc.sum();
        sc.avg();
        sc.substract();

        // 상속을 통해서 코드의 중복을 제거할 수 있고, 부모 클래스를 개선하면 이를 상속 받고 있는 모든 자식 클래스에게 자동으로 적용된다. => 유지보수가 편리하다.
    }
}
