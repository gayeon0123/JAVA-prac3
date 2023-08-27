package 객체지향문법2.상속2;

// 상속 : public class 자식클래스 extends 부모클래스 {}
public class Child extends Parent {
    public int i = 15; // 필드에 대한 오버라이딩
    public void printI() { // 메소드에 대한 오버라이딩
        System.out.println("parent - printI() : " + i);
    }
}
