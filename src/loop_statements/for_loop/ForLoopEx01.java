package loop_statements.for_loop;

/**
 * 단순 for 문
 *  : 반복 횟수를 알고 정할 수 있을때 사용
 *
 * 문법 : for(초깃값 ; 조건식 ; 증/감식) {
 *           // 실행할 코드
 *      }
 */
public class ForLoopEx01 {

    public static void main(String[] args) {

        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
