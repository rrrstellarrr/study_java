package loop_statements.while_loop;

// while 문으로 구구단 출력하기
public class WhileLoopEx02 {

    public static void main(String[] args) {
        int i = 1, j = 1;

        while(i < 10) {
            while(j < 10) {
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            }
            i++;
            j = 1;
        }
    }
}
