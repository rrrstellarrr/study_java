package control_statements.switch_statements;

import java.util.Scanner;

/**
 * switch 문
 *  : 조건값에 따른 처리 블럭을 구분해서 처리할 수 있도록 구조화한 구문으로 상황에 따라 if ~ else if 문의 대체가 가능하다.
 *
 * 문법 : switch(입력 변수) {     // 입력 변수는 정수형, 문자 혹은 문자열
 *      case 조건값:
 *           실행 구문;
 *           break;
 *       ..
 *       default:             // default 는 조건에 해당하는 입력값이 없는 경우 실행되는 코드를 기술한다
 *           기본 실행 구문;
 *      }
 */
public class SwitchStatementEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("과목을 선택해 주세요");
        System.out.println("( 1.수학 2.영어 3.사회 4.과학)");
        System.out.print("과목번호 :");
        int num = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("선택하신 과목은 수학입니다.");
                System.out.println("강의실을 101호 입니다");
                break;
            case 2:
                System.out.println("선택하신 과목은 영어입니다.");
                System.out.println("강의실은 102호 입니다");
                break;
            case 3:
                System.out.println("선택하신 과목은 사회입니다.");
                System.out.println("강의실은 201호 입니다");
                break;
            case 4:
                System.out.println("선택하신 과목은 과학입니다.");
                System.out.println("강의실은 202호 입니다");
                break;
            default:
                System.out.println("선택하신 과목은 개강되지 않은 과목입니다.");
                System.out.println("상담원에게 문의 해주세요");
                break;
        }
        sc.close();
    }
}
