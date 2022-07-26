package OOPs.super_keyword;

class Person {
    int id;
    String name;

    // Person() {}                     // 기본 생성자

    Person(int id, String name) {      // 매개변수가 있는 생성자
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person {              //  Emp 클래스는 Person 클래스를 상속하므로 Person의 모든 속성은 기본적으로 Emp에 상속된다.
    float salary;

    Emp(int id, String name, float salary) {    // 속성을 초기화하기 위해 자식 클래스의 부모 클래스 생성자를 사용 => 부모클래스 생성자 재정의
        super(id, name);
        this.salary = salary;
    }

    void display() {
        System.out.println("id : " + id + ", " + "name : " + name + ", " + "salary : " + salary);
    }
}

public class SuperKeywordEx03 {

    public static void main(String[] args) {
        Emp emp = new Emp(111, "김멍멍", 30000);
        emp.display();
    }
}
