package control_statements.if_statements;

/**
 * if 조건문
 * 문법 : if(조건식) {
 *          실행 코드 블럭(조건식이 true 인 경우 실행됨)
 *      }
 */
public class IfStatementsEx01 {

    public static void main(String[] args) {
        int a = 10;
        int b = 22;

        if(a + b > 30) {
            System.out.println("a + b 는 30보다 큽니다.");
        }
    }
}
