package 기본문법;

// 변수 뒤에 후위 증가식이 붙을 경우 : 변수가 사용된 이후에 값이 증가된다
public class While3 {
    public static void main(String[] args) {
        int i = 0;

        // i와 10이 비교를 한 후 -> i가 1 증가
        while(i++ < 10) {
            System.out.println(i);
        }
    }
}
