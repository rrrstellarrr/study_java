package OOPs.constructors.default_constructor;

/**
 * 기본 생성자는 유형에 따라 0, null 등과 같은 객체의 기본값을 제공하는데 사용된다.
 */
public class Student {
    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        // 생성자를 생성하지 않으므로 컴파일러가 기본 생성자를 제공한다. 여기서 0과 null 값은 기본 생성자에 의해 제공된다.
        Student s1 = new Student();
        Student s2 = new Student();

        s1.display();       // 0 null
        s2.display();       // 0 null
    }
}
