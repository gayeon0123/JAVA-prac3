package 객체지향문법2;

// 필드(멤버변수) : 클래스가 가지는 속성

public class Person {
    String name; // 인스턴스 필드 (static이 안 붙어있음)
    String address;
    boolean isVip;
    static int count = 0; // 클래스 필드
    static{ // 클래스 필드는 static 블록에서 초기화 가능
        count = 100;
    }

    public void printName() { // 인스턴스 메소드
        System.out.println("내 이름은 " + name);
    }

    // * static한 메소드 안에서는 static한 필드만 사용 가능
    public static void printCount() { // 클래스 메소드
//        System.out.println(name); // static한 메소드에서는 인스턴스 필드나, 인스턴스 메소드를 사용 불가능
        System.out.println("count : " + count);
    }
}
