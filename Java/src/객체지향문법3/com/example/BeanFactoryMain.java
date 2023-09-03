package 객체지향문법3.com.example;

// 팩토리 메소드 패턴 : 객체가 생성되는 과정을 숨기고, 완성된 인스턴스만 반환한다

public class BeanFactoryMain {
    public static void main(String[] args) {

        BeanFactory bf1 = BeanFactory.getInstance();
        BeanFactory bf2 = BeanFactory.getInstance();

        if(bf1 == bf2) {
            System.out.println("bf1 == bf2");
        }

        Bus b1 = bf1.getBus();
        Bus b2 = bf1.getBus();
        // Bus b3 = new Bus(); 대신 사용 가능
    }
}
