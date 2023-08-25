package 기본문법;

// 문자를 정수형으로, 정수를 문자로 변환
// (유니코드 97번째 값은 문자 'a'이다)
public class Char {
    public static void main(String[] args) {
        char c1 = 'a';
        System.out.println(c1);

        char c2 = (char)97;
        System.out.println(c2);

        // 문자 'a'부터 'z'까지 출력
        char c3 = 'a';
        while (c3 <= 'z') {
            System.out.println(c3);
            c3++;
        }
    }
}
