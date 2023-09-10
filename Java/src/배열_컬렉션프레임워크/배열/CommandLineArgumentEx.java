package 배열_컬렉션프레임워크.배열;

/* 명령 행 아규먼트 (Command-Line Arguments)
     : JVM이 main메소드를 실행할 때 String[]을 아큐먼트로 넘겨주는 것
        (main메소드 : JVM이 실행하는 메소드)
 */

// Edit Configurations에서 arguments를 'a b "hello world"'로 변경 후 실행하기

public class CommandLineArgumentEx {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("사용법 : CommandLineArgumentEx 값 값 ....");
            System.exit(0); // return; 으로 변경 가능
        }

        for(String arg : args) {
            System.out.println(arg);
        }
    }
}

/*
Hello.java 파일 작성하고
javac Hello.java 실행

명령을 실행할 때 성공하면 아무런 메시지도 출력하지 않는다 -> Unix 철학
Linux도 Unix 계열이다

작은 명령들을 조합해서 또 다른 명령을 만든다 (웹 스크립트 작성)

작은 명령들이 실행되고 종료된다
 */
