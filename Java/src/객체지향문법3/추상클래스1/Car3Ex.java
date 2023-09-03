package 객체지향문법3.추상클래스1;

public class Car3Ex {
    public static void main(String[] args) {
//        Car3 c = new Car3("sonata"); // 추상클래스(abstract)에서는 인스턴스 생성 불가능

        Bus3 b = new Bus3();
        b.run();

        System.out.println();

        SportsCar s1 = new SportsCar("sportsCar!");
        s1.run();

        System.out.println();

        Car3 c = new SportsCar("sportsCar!");
        c.run();

        System.out.println();

        Car3[] array = new Car3[2]; // Car3을 2개 참조할 수 있는 배열을 선언
        array[0] = new Bus3();
        array[1] = new SportsCar("sportsCar!");
        for(Car3 c2 : array) {
            c2.run();
        }
    }
}
