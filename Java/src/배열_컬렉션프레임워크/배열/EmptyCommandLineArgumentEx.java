package 배열_컬렉션프레임워크.배열;

public class EmptyCommandLineArgumentEx {
    public static void main(String[] args) {
        System.out.println(args.length);
    }
}

/* String[] args = new String[0];
   main(args);
 */

// javac EmptyCommandLineArgumentEx.java

// javac EmptyCommandLineArgumentEx a b c d e hello
//  : 공백을 기준으로 자르기 때문에, 5개의 문자열 배열이 args에 들어오게 된다
