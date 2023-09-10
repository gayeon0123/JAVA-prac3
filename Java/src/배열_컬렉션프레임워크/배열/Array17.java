package 배열_컬렉션프레임워크.배열;

import java.util.Arrays;

public class Array17 {
    public static void main(String[] args) {
        int[] array = {5,4,3,1,2};

        // sort : 오름차순 정렬
        Arrays.sort(array);

        for(int i : array) {
            System.out.println(i);
        }
    }
}
