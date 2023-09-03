package 객체지향문법3.추상클래스1;

public class SportsCar extends Car3 {

    // 부모가 기본생성자가 없기 때문에 반드시 super()를 호출한다
    public SportsCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("사륜구동으로 동작한다.");
    }

}
