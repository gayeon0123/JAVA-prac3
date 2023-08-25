package 기본문법;

public class PrimitiveCast {
    public static void main(String[] args) {
        long x2 = 50;
        int i2 = (int)x2;
        System.out.println(x2);
        System.out.println(i2);

        long x3 = Long.MAX_VALUE;
        int i3 = (int)x3; // long타입의 최댓값을 int타입에 넣음 -> 오버플로우 발생 -> 음수값 출력
        System.out.println(x3);
        System.out.println(i3);
    }
}
