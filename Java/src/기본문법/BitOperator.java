package 기본문법;

// shift 연산자
// 우측으로 n shift = 2^n으로 나눠준다
// 좌측으로 n shift = 2^n을 곱해준다
public class BitOperator {
    public static void main(String[] args) {
        int a = 4; // 4byte = 0000 0100
        int b = a >> 1; // 우측으로 1비트 shift -> 0000 0010 = 2byte
        System.out.println(b);

        int c = 4;
        int d = c << 1; // 좌측으로 1비트 shift -> 0000 1000 = 8byte
        System.out.println(d);
    }
}
