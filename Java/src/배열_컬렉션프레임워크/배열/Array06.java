package 배열_컬렉션프레임워크.배열;

// 배열의 길이 : length
public class Array06 {
    public static void main(String[] args) {
        double[] array1 = new double[5];
        double[] array2 = {1.5, 2.4, 3.5};
        double[] array3;
        double[] array4 = null;

        System.out.println(array1.length);
        System.out.println(array1[0]); // 기본으로 0.0 값을 가짐
        System.out.println(array1[1]);
        System.out.println(array1[2]);
        System.out.println(array1[3]);

        System.out.println();

        System.out.println(array2.length);

        // null값은 출력 불가능 (nullpointexception)
//        System.out.println(array3.length);
//        System.out.println(array4.length);
    }
}
