package collections_framework.collection.list;

import java.util.ArrayList;

/**
 * ArrayList : List 인터페이스를 상속받은 클래스로 크기가 가변적으로 변하는 선형리스트
 */
public class ArrayListEx01 {

    public static void main(String[] args) {
        String[] arrayObj = new String[2];      // 정해진 배열 크기를 변경할 수 없다.
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; 오류가 발생한다.

        System.out.println("==== 배열 ====");
        for(int i=0; i<arrayObj.length; i++){   // 배열의 크기(길이) : length
            System.out.println(arrayObj[i]);
        }

        ArrayList<String> list = new ArrayList<String>();         // 크기를 미리 지정하지 않아 크기가 유동적이다.
        list.add("one");
        list.add("two");
        list.add("three");

        System.out.println("==== ArrayList ====");
        for(int i=0; i<list.size(); i++){         // // 배열의 크기(길이) : size()
            String value = list.get(i);
            System.out.println(value);
        }
    }
}
