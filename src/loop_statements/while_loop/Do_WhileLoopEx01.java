package loop_statements.while_loop;

/**
 * do-while 문
 *  : do-while 문은 지정된 조건이 참이 될 때까지 프로그램의 일부를 반복적으로 반복하는 데 사용된다.
 *  반복 횟수가 고정되어 있지 않고 루프를 한 번 이상 실행해야 하는 경우 do-while 문을 사용하는 것이 좋다.
 *
 * 문법 : do {
 *          // 적어도 한 번은 실행되어야 하는 코드(무조건 실행됨)
 *      } while(조건);
 *
 */
public class Do_WhileLoopEx01 {

    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
            i++;;
        } while(i <= 10);
    }
}
