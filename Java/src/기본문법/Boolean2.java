package 기본문법;

public class Boolean2 {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        boolean flag4 = false;
        boolean flag5 = false;
        boolean flag6 = false;

        // &&와 &, ||와 |는 같은 결과를 낸다
        // 단, &&를 사용할 경우 앞의 식이 거짓이면 뒤에 있는 식은 실행되지 않고 결과를 낸다
        //     ||를 사용할 경우 앞의 식이 참이면 뒤의 식은 실행되지 않고 결과를 낸다
        flag1 = 10 > 5 && 5 < 20;
        flag2 = 10 > 5 & 5 < 20;
        flag3 = 10 >= 10 || 5 > 6;
        flag4 = 10 >= 10 | 5 > 6;
        flag5 = 10 == 10 ^ 5 == 4; // ^ : 앞과 뒤의 식의 결과가 같으면 true, 다르면 false
        flag6 = !flag5;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);
        System.out.println(flag5);
        System.out.println(flag6);
    }
}
