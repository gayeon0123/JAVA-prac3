package 기본문법;

// 1부터 10 사이에 있는 짝수만 출력
// continue : 다시 위의 조건문으로 올라감 (아래로 내려가지x)
public class While4 {
    public static void main(String[] args) {
        int i = 0;

        while(i++ < 10) { // i가 0일때, 10과 대소비교
            if(i % 2 != 0) // 0에 1 더해져서, 여기서 i는 1 -> 1을 2로 나눈 나머지는 0이 아님 -> continue로 내려감
                continue; // 밑으로 실행되지 않고, while 조건문으로 다시 올라감
                System.out.println(i);
        }
    }
}
