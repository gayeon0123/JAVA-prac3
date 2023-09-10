package 배열_컬렉션프레임워크.배열;

import java.util.Arrays;

public class Array18 {
    public static void main(String[] args) {
        int[] array = {5,4,3,1,2};

        Arrays.sort(array); // 오름차순 정렬

        // binarySearch : 몇 번째 인덱스에 찾고자 하는 값(4)이 있는지 찾음
        int i = Arrays.binarySearch(array, 4);
        System.out.println(i);
    }
}
