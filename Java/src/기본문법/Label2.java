package 기본문법;

public class Label2 {
    public static void main(String[] args) {
        outter:
        for(int i = 0; i < 3; i++) {
            for(int k = 0; k < 3; k++) {
                if(i == 0 && k == 2)
                    continue outter;
                System.out.println(i + ", " + k);
            }
        }
    }
}
