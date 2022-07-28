package exception_handling.throw_and_throws;

import java.util.Scanner;

/**
 * throws 절은 예외를 선언하는 데 사용한다. 즉, try-catch 블록과 유사하게 작동한다.
 * 반면에 throw는  throw 키워드를 사용하여 강제로 예외를 발생시킨다.
 *
 */

public class ThrowVSThrowsEx01 {
    void checkAge(int age, int cnt){
        if(age < 18) {
            throw new ArithmeticException("미성년자는 주류 구입이 불가합니다.");
        } else {
            System.out.println("소주 " + cnt + "병 구입하였습니다.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력해주세요.");
        int age = sc.nextInt();
        System.out.println("소주 몇병을 구입하겠습니까?");
        int cnt = sc.nextInt();

        ThrowVSThrowsEx01 example = new ThrowVSThrowsEx01();
        example.checkAge(age, cnt);

        System.out.println("감사합니다. 안녕히가세요.");
    }
}
