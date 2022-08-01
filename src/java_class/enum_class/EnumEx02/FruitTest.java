package java_class.enum_class.EnumEx02;

public class FruitTest {

    public static void main(String[] args) {
        for(Fruit f : Fruit.values()) { // values() : 해당 열거체의 모든 상수를 저장한 배열을 생성하여 반환함.
            System.out.println(f + ", " + f.getColor());
        }
    }
}
