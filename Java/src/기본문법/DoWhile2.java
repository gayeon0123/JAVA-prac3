package 기본문법;

// do/while 문장은 무조건 한번은 실행된다
public class DoWhile2 {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        }while(i < 1);
    }
}
