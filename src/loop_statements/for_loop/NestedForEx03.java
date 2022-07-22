package loop_statements.for_loop;

import java.util.Scanner;

/**
 * 다중 for 문을 사용하여 마름모 별 짝기 2
 *
 * 문제 : 왼쪽으로 정렬한 직각 삼각형을 별을 찍으시오. (Scanner 이용)
 */
public class NestedForEx03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오.");

        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
