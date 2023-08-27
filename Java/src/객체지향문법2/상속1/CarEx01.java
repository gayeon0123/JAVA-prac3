package 객체지향문법2.상속1;

public class CarEx01 {
    public static void main(String[] args) {
        // ** 메소드가 오버라이딩되면, 무조건 오버라이딩 된 '자식' 메소드가 실행된다
        //     -> b1, c1의 인스턴스는 모두 Bus()이다
        Bus b1 = new Bus();
        b1.run();
        b1.안내방송();

        Car c1 = new Bus(); // 버스는 자동차다
        c1.run(); // 그 자동차(c1)는 달린다
//        c1.안내방송(); // Car클래스의 객체만 사용 가능하므로, 안내방송()메서드는 사용 불가능

        Bus b2 = (Bus)c1; // c1이 참조하는 것을 b2도 참조해라 + Bus타입으로 바꿔서
        b2.안내방송();

        Car c2 = new SuperCar();
        c2.run(); // Car클래스가 갖고있는 메소드만 사용 가능
    }
}
