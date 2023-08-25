package 기본문법;

// 오버플로우 (overflow)
//  : 계산 결과가 최댓값을 넘거나, 최솟값보다 작을 경우
//    음수는 양수로, 양수는 음수로 바뀌는 문제가 발생하는 것
public class NumberOverflow {
    public static void main(String[] args) {
        int value = 10;
        int maxInt = Integer.MAX_VALUE;

        System.out.println(value + 1);
        System.out.println(maxInt + 1); // 오버플로우 발생


        // <타입의 변환>
        // double형 타입은 정수값이 잘 대입된다
        double d1 = 50;
        double d2 = 500L;

        System.out.println(d1);
        System.out.println(d2);

        // int형 타입에 실수를 대입하면 오류가 발생한다
        // int i1 = 50.0; (x)
        // int i2 = 25.4f; (x)

        // 실수 값을 정수에 저장하려면 형 변환을 해야한다
        int i1 = (int)50.0;
        int i2 = (int)25.6f;

        System.out.println(i1);
        System.out.println(i2);

        // 크기가 큰 타입은 작은 타입을 저장할 수 있다
        // 크기가 큰 타입 순서 : long > int > short > byte
        short s = 5;
        int i = s;
        long x = i;

        System.out.println(i);
        System.out.println(x);

    }
}
