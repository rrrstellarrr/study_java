package loop_statements.while_loop;

/**
 * while 문
 *  : while문은 반복조건이 true이면 중괄호 구간을 반복적으로 실행한다. 조건이 false 이면 반복문은 실행되지 않는다.
 * 	  반복문에서 종료조건(true/false)을 잘못 지정하면 무한 반복이 되거나 반복문이 실행되지 않는다.
 *
 * 문법 : while(조건) {
 *          // 조건이 true일 경우, 실행할 코드
 *      }
 */
public class WhileLoopEx01 {

    public static void main(String[] args) {
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}
