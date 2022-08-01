package generics;

/**
 * 복수의 제네릭
 */
class EmployeeInfo {
    public int rank;

    public EmployeeInfo(int rank) {
        this.rank = rank;
    }
}

class Person2<T, S> {

    public T info;
    public S id;

    public Person2(T info, S id) {
        this.info = info;
        this.id = id;
    }
}

public class GenericEx02 {

    public static void main(String[] args) {
        EmployeeInfo employeeInfo = new EmployeeInfo(1);
        Integer i = 10;
        Person2<EmployeeInfo, Integer> person2 = new Person2<EmployeeInfo, Integer>(employeeInfo, i);

        System.out.println(person2.id.intValue());
    }
}
