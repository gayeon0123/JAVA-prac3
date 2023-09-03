package 객체지향문법3.com.example;

// 클래스 로더를 이용한 인스턴스 생성하기
// Class clazz = Class.forName("클래스풀네임");
// Object obj = clazz.newInstance();

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception {

        /* a() 메소드를 가지고 있는 클래스가 있다.
           이 클래스이름이 아직 무엇인지 모르겠다.
           나중에 이 클래스이름을 알려주겠다.
           a() 메소드를 실행하는 코드를 작성해라.
         */

//        Bus b1 = new Bus();
//        b1.a();

        // className에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고,
        // 그 정보를 clazz가 참조하도록 한다.
//        String className = "객체지향문법3.com.example.Bus";
//        Class clazz = Class.forName(className);
//
//        Method[] declaredMethods = clazz.getDeclaredMethods();
//
//        for(Method m : declaredMethods) {
//            System.out.println(m.getName());
//        }

        // 아래 세 줄은 Object o = new Bus(); 라는 의미 -> Bus 인스턴스를 생성
//        String className = "객체지향문법3.com.example.Bus";
//        Class clazz = Class.forName(className);
//        Object o = clazz.newInstance();
//
//        Bus b = (Bus)o;
//        b.a();

        String className = "객체지향문법3.com.example.SuperCar";
        Class clazz = Class.forName(className);
        Object o = clazz.newInstance();

//        Car b = (Car)o; // 위에서 생성된 "객체지향문법3.com.example.SuperCar"인스턴스는 Car의 상속을 받으므로, 형변환한다
//        b.a(); // 해당 클래스의 a() 메소드 호출

        Method m = clazz.getDeclaredMethod("a", null); // a() 메소드 정보를 가지고 있는 Method를 반환
        m.invoke(o, null); // Object o 가 참조하는 객체의 m 메소드를 실행

    }
}
