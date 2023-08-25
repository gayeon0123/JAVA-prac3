package 기본문법;

// if문장에 중괄호가 없을 경우
//  : if문장 다음 문장만 조건에 만족할 경우 실행된다 (들여쓰기를 잘못한 안좋은 코드의 예)
public class If3 {
    public static void main(String[] args) {
        int a = 10;

        if(a > 5)
            System.out.println("a는 10보다 큽니다.");
            System.out.println("hello");
    }
}
