package 객체지향문법3.com.example.fw;

/*
Controller의 종류는 여러가지이다.
초기화 - 같은 코드
실행 - 다른 코드!
마무리 - 같은 코드
 */

public abstract class Controller {

    // protected : 같은 package이거나 상속받았을 경우에만 접근 가능
    // final이 붙으면 오버라이딩이 불가능해짐
    protected final void init() {
        System.out.println("초기화 하는 코드");
    }

    protected final void close() {
        System.out.println("마무리 하는 코드");
    }

    public abstract void run(); // 매번 다른 코드

    // 템플릿 메소드 : 내가 가지고 있는 메소드를 호출한다. 어떤 순서를 가지고 있다.
    public void execute() {
        this.init(); // this. 생략가능
        this.run();
        this.close();
    }
}
