package loop_statements.for_loop;

import java.util.Scanner;

/**
 * 다중 for 문을 사용하여 별 짝기 5
 *
 * 문제 : '별 짝기 3'의 상하반전 정렬한 직각 삼각형 모양으로 별을 찍으시오. (Scanner 이용)
 *
 * 예상결과 : ...
 *          ****
 *           ***
 *            **
 *             *
 *
 * 생각해보기 : 1번째 줄 - n(입력 받은 값) 만큼의 별, 공백X
 *           2번째 줄 - n(입력 받은 값) -1만큼의 별, 공백 1개
 *           ...
 *           n번째 줄 - 별 1개, 공백 n - 1개
 */
public class NestedForEx06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오.");

        int num = sc.nextInt();
        for(int i = 0; i < num; i++) {  // num번 만큼 반복
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
