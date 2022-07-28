package exception_handling.try_catch;

import java.util.Scanner;

/**
 * 예외처리
 *
 * 문법 : try {
 *     예외를 처리하길 원하는 실행 코드;
 * } catch (e1) {
 *     e1 예외가 발생할 경우에 실행될 코드;
 * } catch (e2) {
 *     e2 예외가 발생할 경우에 실행될 코드;
 * }
 * ...
 * finally {
 *     예외 발생 여부와 상관없이 무조건 실행될 코드;
 * }
 */
public class ExceptionHandlingEx01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 2개를 입력해주세요.");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {   // 기본적으로 맨 먼저 실행되는 코드로 여기에서 발생한 예외는 catch 블록에서 처리된다.
            int result =num1 / num2;    // 예외 처리 하지 않았을 경우 : Exception in thread "main" java.lang.ArithmeticException: / by zero
            System.out.println("num1 / num2 = " + result);
        } catch(ArithmeticException e) {    // try 블록에서 발생한 예외 코드나 예외 객체를 인수로 전달받아 그 처리를 담당한다.
            System.out.println("0으로 나눌 수 없습니다.");
        } finally { // try 블록에서 예외가 발생하건 안 하건 맨 마지막에 무조건 실행된다.
            System.out.println("0이외의 숫자를 입력해주세요.");
        }
    }
}
