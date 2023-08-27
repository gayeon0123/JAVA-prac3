package 객체지향문법2.com.example.main;

import 객체지향문법2.com.example.util.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int value = cal.plus(50, 100);
        System.out.println(value);

        // 또 다른 패키지의 메소드 호출 시 -> 패키지명 = new 패키지명;
        객체지향문법2.com.example.util2.Calculator cal2 = new 객체지향문법2.com.example.util2.Calculator();
        int value2 = cal2.divide(100, 50);
        System.out.println(value2);
    }
}
