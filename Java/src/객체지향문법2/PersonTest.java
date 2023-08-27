package 객체지향문법2;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person(); // 인스턴스 1
        Person p2 = new Person(); // 인스턴스 2

        p1.name = "홍길동"; // 문자열은 new를 사용하지 않고 인스턴스를 사용 가능
        p1.address = "일산";
        p1.isVip = true;

        p2.name = "조조";
        p2.address = "서울";

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.isVip);

        System.out.println("-------------");
        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);
    }
}
