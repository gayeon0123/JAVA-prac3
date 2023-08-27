package 객체지향문법2;

// static블록이 main메소드보다 먼저 실행됨
public class Hello2 {
    static int i;
    static{
        i = 500;
        System.out.println("static block"); // 원래는 static field를 초기화한다
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}