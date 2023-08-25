package 기본문법;

// break : 현재 반복문을 빠져나감
// continue : continue문 아래 부분을 실행하지 않고 다시 반복

// label
//  : break, continue문의 한계를 해결
//  : 중첩반복문을 한번에 빠져나갈 때 사용
//  : continue이하를 실행하지 않고 한번에 중첩 반복문을 반복할 때 사용
public class Label {
    public static void main(String[] args) {
        outter: // outter 부분을 라벨이라고 한다
        for(int i = 0; i < 3; i++) {
            for(int k = 0; k < 3; k++) {
                if(i == 0 && k == 2)
                    break outter;
                System.out.println(i + ", " + k);
            }
        }
    }
}
