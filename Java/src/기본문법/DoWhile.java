package 기본문법;

// 변수의 초기화
// do {
//      탈출 조건식이 참일 경우 실행되는 코드;
//      변수의 증감식;
// } while (탈출 조건식);

// 1부터 10까지 정수 출력
public class DoWhile {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        }while (i <= 10);
    }
}
