package collections_framework.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet<E> 클래스 :  데이터가 정렬된 상태로 저장되는 이진 검색 트리(binary search tree)의 형태로 요소를 저장한다.
 *                    이진 검색 트리는 데이터를 추가하거나 제거하는 등의 기본 동작 시간이 매우 빠르다는 장점이 있다.
 */
public class TreeSetEx01 {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        // add() 메소드를 이용한 요소의 저장
        ts.add(30);
        ts.add(40);
        ts.add(20);
        ts.add(10);

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for (int e : ts) {
            System.out.print(e + " ");
        }
        System.out.println();

        // remove() 메소드를 이용한 요소의 제거
        ts.remove(40);

        // iterator() 메소드를 이용한 요소의 출력
        Iterator<Integer> iter = ts.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("이진 검색 트리의 크기 : " + ts.size());

        // subSet() 메소드를 이용한 부분 집합의 출력
        // public NavigableSet<E> subSet(E fromElement, E toElement) : 첫 번째 매개변수로 전달된 값에 해당하는 요소부터 시작하여 두 번째 매개변수로 전달된 값에 해당하는 요소의 바로 직전 요소까지를 반환
        System.out.println(ts.subSet(10, 20));
        // public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)
        // : 두 번째와 네 번째 매개변수로 각각 첫 번째와 세 번째 매개변수로 전달된 값에 해당하는 요소를 포함할 것인지 아닌지를 명시
        System.out.println(ts.subSet(10, true, 20, true));
    }
}
