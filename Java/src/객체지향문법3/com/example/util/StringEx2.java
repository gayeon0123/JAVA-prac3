package 객체지향문법3.com.example.util;

public class StringEx2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        // equals() : 값이 같냐?
        if(str1.equals(str2)) {
            System.out.println("str1과 str2의 값이 같다.");
        }

        // toUpperCase() : 대문자로 바꾸기
        String s = str1.toUpperCase();
        System.out.println(s);
        System.out.println(str1); // String은 불변 객체이다

        // substering(n) : 인덱스 n번째부터 값을 보여줌
        String substring = str1.substring(3);
        System.out.println(substring);
        System.out.println(str1); // String은 불변 객체이다
    }
}
