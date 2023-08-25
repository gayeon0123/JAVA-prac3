package 기본문법;

// break, default 추가
public class Switch2 {
    public static void main(String[] args) {
        int num = 2;

        switch(num) {
            case 1:
                System.out.println("1입니다.");
                break;
            case 2:
                System.out.println("2입니다.");
                break;
            case 3:
                System.out.println("3입니다.");
                break;
            default :
                System.out.println("1,2,3이 아닙니다.");
        }
    }
}
