package control_statements.if_statements;

/**
 * if~else if~else 조건문
 * 문법 : if(조건식1) {
 *          실행 코드 블럭(조건식1이 true 인 경우 실행됨)
 *      } else if(조건식2) {
 *          실행 코드 블럭(조건식1이 false 이고, 조건식2가 true 인 경우 실행됨)
 *      } else {
 *          실행 코드 블럭(위 조건식이 모두 false 인 경우 실행됨)
 *      }
 */
public class If_StatementsEx03 {

    public static void main(String[] args) {
        String str = "사과";
        // String str = "바나나";
        //  String str = "자전거";

        if(str.equals("사과")) {
            System.out.println("사과입니다.");
        } else if(str.equals("바나나")) {
            System.out.println("바나나입니다.");
        } else {
            System.out.println("자전거입니다.");
        }
    }
}
