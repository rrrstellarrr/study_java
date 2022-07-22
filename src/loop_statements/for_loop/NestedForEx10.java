package loop_statements.for_loop;

import java.util.Scanner;

/**
 * 다중 for 문을 사용하여 별 짝기 9
 *
 * 문제 : 마름모 모양으로 별을 찍으시오. (Scanner 이용)
 *
 * 예상결과 :    *
 *            ***
 *           *****
 *          *******
 *            ...
 *          *******
 *           *****
 *            ***
 *             *
 */
public class NestedForEx10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오.");

        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = num; i > 1; i--) {
            for(int j = 0; j <= num - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * (i - 1) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
