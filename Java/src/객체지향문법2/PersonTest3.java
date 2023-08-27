package 객체지향문법2;

public class PersonTest3 {
    public static void main(String[] args) {
        // static한 블록은 static 필드를 초기화한다
        System.out.println(Person.count); // 100
        Person.printCount(); // 100

        Person p1 = new Person();
        p1.name = "홍길동";

        System.out.println(p1.name);
        p1.printName();

        System.out.println();

        p1.printName();
        Person.printCount(); // p1.printCount(); 가능

        Person.count++;
        Person.printCount(); // p1.printCount(); 가능
    }
}
