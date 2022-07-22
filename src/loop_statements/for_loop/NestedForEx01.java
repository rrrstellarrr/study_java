package loop_statements.for_loop;

/**
 * 다중 for 문을 사용하여 구구단 출력하기
 */
public class NestedForEx01 {

    public static void main(String[] args) {
        for(int i = 1; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println();
        }
    }
}
