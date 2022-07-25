package OOPs.constructors.parameterized_constructor;

/**
 * 매개변수 생성자
 *  : 특정 수의 매개변수를 갖는 생성자
 *    고유한 개체에 다른 값을 제공하는 데 사용
 */
public class Student {
    int id;
    String name;

    // 매개변수 생성자 생성
    Student(int id, String name) {
        this.id = id;       // this.id : 인스턴스 자신(전역변수), int id : 매개변수(지역변수)
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        // 객체 생성 및 값 전달
        Student s1 = new Student(111, "김철수");
        Student s2 = new Student(222, "박아름");

        // 객체의 값을 표시하는 메소드 호출
        s1.display();
        s2.display();
    }
}
