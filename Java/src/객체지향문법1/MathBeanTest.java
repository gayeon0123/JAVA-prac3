package 객체지향문법1;

public class MathBeanTest {
    public static void main(String[] args) {

        // MathBean이 가지고 있는 메소드를 사용하기 위해 MathBean 인스턴스 생성
        MathBean math = new MathBean();

        math.printClassName();
        math.printNumber(5000);

        int x = math.getOne();
        System.out.println(x);

        int value = math.plus(200,300);
        System.out.println(value);
    }
}
