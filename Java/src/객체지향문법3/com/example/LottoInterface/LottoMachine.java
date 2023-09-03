package 객체지향문법3.com.example.LottoInterface;

/* 인터페이스 작성 문법
    : 인터페이스 이름은 Upper CamelCase로 작성
    : 인터페이스의 확장자가 .java 파일로 작성
    : 인터페이스의 모든 필드는 public static final 이어야 하며, 모든 메소드는 public abstract이어야 한다
      (final, abstract를 생략하면 자동으로 붙는다)
 */

/*
1. 1~45까지 써있는 Ball을 로또 기계에 넣는다.
2. 로또 기계에 있는 Ball들을 섞는다.
3. 섞인 Ball 중에서 6개를 꺼낸다.
 */

public interface LottoMachine {
    int MAX_BALL_COUNT = 45;
    int RETURN_BALL_COUNT = 6;
    public void setBalls(Ball[] balls); // Ball[] : Ball이 여러개를 받겠다
    public void mix(); // 자기가 가지고 있는 Ball들을 섞는다
    public Ball[] getBalls(); // 6개의 Ball을 반환한다
}
