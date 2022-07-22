package loop_statements.for_loop;

import java.util.Scanner;

/**
 * 다중 for 문을 사용하여 별 짝기 6
 *
 * 문제 : 정삼각형 모양으로 별을 찍으시오. (Scanner 이용)
 *
 * 예상결과 :    *
 *            ***
 *           *****
 *          *******
 *            ...
 *
 * 생각해보기 : 1번째 줄 - n(입력 받은 값) -1만큼의 공백, 별 1개
 *           2번째 줄 - n(입력 받은 값) -2만큼의 공백, 별 3개 (2n-1)
 *           ...
 */
public class NestedForEx07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하시오.");

        int num = sc.nextInt();
        for(int i = 1; i <= num; i++) {  // num번 만큼 반복
            for(int j = num - i; j > 0; j--) {  // 공백
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++) {  // 별
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
