package 기본문법;

// while(true) {...} : 무한 루프 (끝없이 반복)
// i가 11일 경우 while블록을 빠져나가기
public class While2 {
    public static void main(String[] args) {
        int i = 1;

        while(true) {
            if(i == 11) break;
            System.out.println(i);
            i++;
        }
    }
}
