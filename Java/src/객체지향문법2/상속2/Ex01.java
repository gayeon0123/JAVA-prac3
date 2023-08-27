package 객체지향문법2.상속2;

// 필드는 'Type'을 따라간다
// ** 메소드는 오버라이딩된 '자식'의 메소드가 실행된다
public class Ex01 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        System.out.println(p1.i);
        p1.printI();

        System.out.println("-------------");

        Child c1 = new Child();
        System.out.println(c1.i);
        c1.printI();

        System.out.println("-------------");

        Parent p2 = new Child(); // Child는 Parent의 후손(자식)이다
        System.out.println(p2.i); // p2의 i를 출력 -> p2 필드는 Parent 타입을 따라간다
        p2.printI(); // ** 메소드는 오버라이딩되면 무조건 '자식'메소드가 실행된다
        p2.printII(); // 필드(p2)는 타입(Parent)을 따라간다

    }
}
