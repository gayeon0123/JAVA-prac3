package 배열_컬렉션프레임워크.배열;

/* 제한 없는 아규먼트 (unlimited arguemtns)
리턴타입 메소드이름(타입... 변수명) {
}
 */

public class UnlimitedArgumentsEx {
    public static void main(String[] args) {
        System.out.println(sum(5, 10));
        System.out.println(sum(1, 2, 4, 2));
        System.out.println(sum(3, 1, 2, 3, 4, 10));
    }

        public static int sum(int... args) {
            System.out.println("print1 메소드 - args  길이 : " + args.length);

            int sum = 0;
            for(int i = 0; i < args.length; i++) {
                sum += args[i];
            }
            return sum;
        }
    }
