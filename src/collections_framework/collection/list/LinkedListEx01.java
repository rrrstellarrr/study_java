package collections_framework.collection.list;

import java.util.LinkedList;

public class LinkedListEx01 {

    public static void main(String[] args) {
        LinkedList<String> lnkList = new LinkedList<String>();

        // add() 메소드를 이용한 요소의 저장
        lnkList.add("넷");
        lnkList.add("둘");
        lnkList.add("셋");
        lnkList.add("하나");

        // for 문과 get() 메소드를 이용한 요소의 출력
        for (int i = 0; i < lnkList.size(); i++) {
            System.out.print(lnkList.get(i) + " ");
        }
        System.out.println();

        // remove() 메소드를 이용한 요소의 제거
        lnkList.remove(1);      // remove(int index) : 해당 리스트의 특정 위치에 존재하는 요소를 제거함. (선택적 기능)

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        for (String e : lnkList) {
            System.out.print(e + " ");
        }
        System.out.println();

        // set() 메소드를 이용한 요소의 변경
        lnkList.set(2, "둘");        // set(int index, E e) : 해당 리스트의 특정 위치에 존재하는 요소를 전달받은 객체로 대체함. (선택적 기능)

        for (String e : lnkList) {
            System.out.print(e + " ");
        }
        System.out.println();

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("리스트의 크기 : " + lnkList.size());
    }
}
