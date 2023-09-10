package 배열_컬렉션프레임워크.배열;

/* 배열 - 참조 타입
       - 같은 타입의 변수가 여러개 필요할 때 사용
 */

public class Array01 {
    public static void main(String[] args) {
        // array1, array2, array3은 배열을 참조할 수 있다
        int[] array1;
        int array2[];
        int array3[];

        array1 = new int[5];
        array2 = new int[5];
        array3 = new int[0]; // array3은 정수를 아무것도 가질 수 없는 배열

        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(array3.length);
    }
}
