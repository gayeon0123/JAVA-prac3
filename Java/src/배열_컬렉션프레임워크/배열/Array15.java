package 배열_컬렉션프레임워크.배열;

import java.util.Arrays;

public class Array15 {
    public static void main(String[] args) {
        char[] copyFrom = {'h','e','l','l','o','!'};

        // copyOfRange를 통해 배열의 일부분만 복사함
        char[] copyTo = Arrays.copyOfRange(copyFrom, 1, 3);

        for(char c : copyTo) {
            System.out.println(c);
        }
    }
}
