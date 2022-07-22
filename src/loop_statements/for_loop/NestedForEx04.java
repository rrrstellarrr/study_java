package loop_statements.for_loop;

import java.util.Scanner;

/**
 * 다중 for 문을 사용하여 별 짝기 3
 *
 * 문제 : 오른쪽으로 정렬한 직각 삼각형을 별을 찍으시오. (Scanner 이용)
 *
 * 예상결과 :    *
 *            **
 *           ***
 *           ...
 *
 * 생각해보기 : 1번째 줄 - n(입력 받은 값) -1만큼의 공백, 별 1개
 *           2번째 줄 - n(입력 받은 값) -2만큼의 공백, 별 2개
 *           ...
 *           n번째 줄 - 공백X, 별 n개
 */
public class NestedForEx04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오.");

        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {  // num번 만큼 반복
            for(int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
