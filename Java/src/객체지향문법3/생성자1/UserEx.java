package 객체지향문법3.생성자1;

import 객체지향문법3.생성자1.User;

public class UserEx {
    public static void main(String[] args) {
        User user = new User("김가연", "gimgayeon20@gmail.com");
//        System.out.println(user.getName());
//        System.out.println(user.getEmail());
        System.out.println(user);

        User user2 = new User("홍길동", "hong@example.com", "1234");
//        System.out.println(user2.getName());
//        System.out.println(user2.getEmail());
//        System.out.println(user2.getPassword());
        System.out.println(user2);
        }
    }
