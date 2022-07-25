package OOPs.constructors.default_constructor;

/**
 * 기본 생성자(인수가 없는 생성자)
 *  : 클래스에 생성자가 없으면 컴파일러는 자동으로 기본 생성자를 만든다.
 *    인스턴스를 생성해주는 역할
 *
 *
 * 문법 : 클래스이름() {}
 */
public class Bike {

    // 기본 생성자
    Bike() {    // 초기화
        System.out.println("자전거가 생성되었습니다.");
    }

    public static void main(String[] args) {

        // 기본생성자 호출
        Bike b = new Bike();
    }
}
