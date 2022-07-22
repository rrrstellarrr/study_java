package loop_statements.while_loop;

// do-while 문으로 구구단 출력하기
public class Do_WhileLoopEx02 {

    public static void main(String[] args) {
        int i = 1;
        do{
            int j = 1;
            do{
                System.out.println(i + " * " + j + " = " + i * j);
                j++;
            } while(j < 10);
            i++;
        } while(i < 10);
    }
}
