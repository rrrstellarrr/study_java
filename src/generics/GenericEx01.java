package generics;

/**
 * 제네릭 : 데이터의 타입(data type)을 일반화한다(generalize)는 것을 의미.
 *        클래스 내부에서 사용할 데이터 타입을 나중에 인스턴스를 생성할 때 확정하는 것.
 *        클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 미리 지정하는 방법이다.
 * 장점 : 클래스나 메소드 내부에서 사용되는 객체의 타입 안정성을 높일 수 있다.
 *       반환값에 대한 타입 변환 및 타입 검사에 들어가는 노력을 줄일 수 있다.
 */
class Person<T> {

    public T info;
}

public class GenericEx01 {

    public static void main(String[] args) {
        Person<String> p1 = new Person<String>();
        Person<StringBuilder> p2 = new Person<StringBuilder>();

        System.out.println(p1.getClass().getName());
        System.out.println(p2.getClass().getName());
    }
}
