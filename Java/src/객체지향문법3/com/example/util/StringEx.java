package 객체지향문법3.com.example.util;

public class StringEx {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println();

        // == : 같은 것을 참조하느냐(o), 값이 같냐(x)
        // String을 사용할 때는 메모리를 덜 사용하기 위해 new를 사용하지 않는 것이 좋음
        if(str1 == str2)
            System.out.println("str1 == str2");
        if(str1 == str3)
            System.out.println("str1 == str3");
        if(str3 == str4)
            System.out.println("str3 == str4");
    }
}
