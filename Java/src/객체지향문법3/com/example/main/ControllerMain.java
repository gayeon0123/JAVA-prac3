package 객체지향문법3.com.example.main;

import 객체지향문법3.com.example.fw.Controller;
import 객체지향문법3.com.example.myproject.FirstController;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute();
    }
}
