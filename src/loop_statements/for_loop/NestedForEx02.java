package loop_statements.for_loop;

/**
 * 다중 for 문을 사용하여 별 짝기 1
 *
 * 문제 : 정사각형 별을 찍으시오.
 */
public class NestedForEx02 {

    public static void main(String[] args) {
        int num = 3;

        for(int i = 0; i <= num; i++) {
            for(int j = 0; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
