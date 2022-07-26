package OOPs.super_keyword;

/**
 * super : 부모 클래스 객체를 참조하는 데 사용되는 참조 변수.
 * 사용 : 1. 부모 클래스와 자식 클래스 모두에 같은 이름을 가진 멤버가 있을 때 부모 클래스의 데이터 멤버에 액세스 하려면 super 키워드를 사용해야한다.
 *       2. 부모 클래스의 인수가 없고 매개변수화된 생성자를 명시적으로 호출하려면 super 키워드를 사용해야한다.
 *       3. 자식 클래스가 재정의된 경우 부모 클래스의 메서드에 액세스 하려면 super 키워드를 사용해야한다.
 */
class Animal {
    String color = "white";
}

class Dog extends Animal {
    String color = "black";

    void printColor() {
        System.out.println(color);          // Dog 클래스의 color를 출력
        System.out.println(super.color);    // Animal(부모클래스) 의 color 출력. super는 직계 부모 클래스 인스턴스 변수를 참조
    }
}

public class SuperKeywordEx01 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printColor();
    }
}
