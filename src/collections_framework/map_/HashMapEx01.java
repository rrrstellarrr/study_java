package collections_framework.map_;

import java.util.HashMap;
import java.util.Iterator;

/**
 * HashMap<K, V> 클래스 : 키와 값을 하나의 쌍으로 저장하는 방식(key-value 방식)을 사용.
 *                      요소의 저장 순서X, 키는 중복을 허용하지 않지만, 값의 중복은 허용.
 */
public class HashMapEx01 {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // put() 메소드를 이용한 요소의 저장
        hm.put("삼십", 30);   // put(K key, V value) : 해당 맵에 전달된 키에 대응하는 값으로 특정 값을 매핑.
        hm.put("십", 10);
        hm.put("사십", 40);
        hm.put("이십", 20);

        // Enhanced for 문과 get() 메소드를 이용한 요소의 출력
        System.out.println("맵에 저장된 키들의 집합 : " + hm.keySet());
        for (String key : hm.keySet()) {
            System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
        }
        System.out.println();

        // remove() 메소드를 이용한 요소의 제거
        hm.remove("사십");    // remove(Object key) : 해당 맵에서 전달된 키에 대응하는 매핑을 제거.

        // iterator() 메소드와 get() 메소드를 이용한 요소의 출력
        Iterator<String> keys = hm.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
        }
        System.out.println();

        // replace() 메소드를 이용한 요소의 수정
        hm.replace("이십", 200);  // replace(K key, V value) : 해당 맵에서 전달된 키에 대응하는 값을 특정 값으로 대체gka.

        for (String key : hm.keySet()) {    // Set<K> keySet() : 해당 맵에 포함되어 있는 모든 키로 만들어진 Set 객체를 반환.
            System.out.println(String.format("키 : %s, 값 : %s", key, hm.get(key)));
        }
        System.out.println();

        // size() 메소드를 이용한 요소의 총 개수
        System.out.println("맵의 크기 : " + hm.size());
    }
}
