package 객체지향문법3.com.example;

/* 이름없는 클래스 (Anonymous Class)
     : new 생성자() {}
     : 생성자 뒤에 중괄호가 나오고 코드를 오버라이딩하여 보통 구현한다
 */

public class CarEx {
    public static void main(String[] args) {

        Car c1 = new Car() { // Car를 상속받고 있는 이름없는 객체의 인스턴스가 만들어짐
            @Override
            public void a() {
                System.out.println("이름없는 객체의 a()메소드 오버라이딩");
            }
        };

        c1.a();
    }
}
