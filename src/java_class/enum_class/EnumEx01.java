package java_class.enum_class;

import java.util.Scanner;

/**
 * enum 클래스 : enum 키워드를 사용하여 열거체를 정의할 수 있다.
 *
 * 문법 :
 *      1) 정의 : enum 열거체이름 { 상수1이름, 상수2이름, ... }
 *      2) 사용 방법 : 열거체이름.상수이름
 */
enum Directions {
    EAST,
    WEST,
    NORTH,
    SOUTH
}

public class EnumEx01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String compass = sc.next();
        Directions directions = Directions.valueOf(compass);    // valueOf(String name) : 전달된 문자열과 일치하는 해당 열거체의 상수를 반환함.

        System.out.println("Direction: " + directions);
        System.out.println("Direction Index: " + directions.ordinal()); // ordinal() : 해당 열거체 상수가 열거체 정의에서 정의된 순서(인덱스)를 반환함.
    }
}
