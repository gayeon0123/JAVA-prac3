package 객체지향문법2.상속2;

public class Parent {
    public int i = 5 ;
    public void printI() {
        System.out.println("parent - printI() : " + i);
    }

    public void printII() {
        System.out.println(i * 2); // 10
    }
}
