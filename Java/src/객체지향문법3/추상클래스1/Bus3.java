package 객체지향문법3.추상클래스1;

public class Bus3 extends Car3 {
    public Bus3() {
        super("Bus!");
        System.out.println("Bus3 기본생성자");
    }

    // 부모가 가지고 있는 추상메소드는 자식에서 반드시 구현해야 한다
    @Override
    public void run() {
        System.out.println("후륜구동으로 동작한다.");
    }
}
