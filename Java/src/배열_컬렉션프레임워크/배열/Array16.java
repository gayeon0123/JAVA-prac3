package 배열_컬렉션프레임워크.배열;

import java.util.Arrays;

public class Array16 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        // int[] array2 = {1,2,3,4,6};
        // int[] array2 = {1,2,3,4,4};

        /* compare : (비교할때는) 양수, 0, 음수
                   : 왼쪽 값이 크면, 양수
                   : 오른쪽 값이 크면, 음수
                   : 값이 같으면, 0 이 나온다
        */
        int compare = Arrays.compare(array1, array2);

        System.out.println(compare);
    }
}
