package collections_framework.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * ArrayList<E> 클래스
 *  : 배열을 이용하기 때문에 인덱스를 이용해 배열 요소에 빠르게 접근할 수 있다.
 *  하지만 배열은 크기를 변경할 수 없는 인스턴스이므로, 크기를 늘리기 위해서는 새로운 배열을 생성하고 기존의 요소들을 옮겨야 하는 복잡한 과정을 거쳐야 한다.
 */
public class ArrayListEx02 {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        // add() 메소드를 이용한 요소의 저장
        arrList.add(10);
        arrList.add(40);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);
        System.out.println(arrList);

        // remove() 메소드를 이용한 요소의 제거
        arrList.remove(1);
        System.out.println(arrList);

        // Collections.sort() 메소드를 이용한 요소의 정렬
        Collections.sort(arrList);
        System.out.println(arrList);

        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = arrList.iterator();    // Iterator는 자바의 컬렉션 프레임워크에서 컬렉션에 저장되어 있는 요소들을 읽어오는 방법

        while (iter.hasNext()) {    // hasNext() : 읽어올 요소가 남아있는지 확인하는 메소드이다. 요소가 있으면 true, 없으면 false
            System.out.print(iter.next() + " ");
        }
        System.out.println();
        // set() 메소드를 이용한 요소의 변경
        arrList.set(0, 20);

        for (int e : arrList) {
            System.out.print(e + " ");
        }
        System.out.println();
        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("리스트의 크기 : " + arrList.size());
    }
}
