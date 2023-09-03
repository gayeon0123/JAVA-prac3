package 객체지향문법3.com.example.myproject;

import 객체지향문법3.com.example.fw.Controller;

public class FirstController extends Controller {
    // 추상클래스(abstract)를 상속받으면 반드시 오버라이딩 해야함
    @Override
    public void run() {
        System.out.println("별도로 동작하는 코드 11111");
    }
}
