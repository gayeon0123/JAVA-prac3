package 기본문법;

// 문자열과 더해지면 문자열이 된다
public class StringExam {
    public static void main(String[] args) {
        String str1 = "hello" + 1;
        String str2 = "hello" + true;
        String str3 = "hello" + 50.4;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
