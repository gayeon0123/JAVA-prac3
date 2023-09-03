package 객체지향문법3.추상클래스1;

public abstract class Car3 {

    public Car3(String name) {
        super();
        System.out.println("Car3() 생성자 호출");
    }

    // 추상메소드인 Car3에 run()이라는 메소드가 필요할 때
    // run()은 자동차마다 다르게 구현할 것임 -> 이때는 블럭 생성 x
    public abstract void run();
}
