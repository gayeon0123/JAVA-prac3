package 배열_컬렉션프레임워크.배열;

public class Array07 {
    public static void main(String[] args) {
        double[] array = {1.5, 2.4, 3.5};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        // System.out.println(array[3]); // ArrayIndexOutOfBoundsException 에러 발생

        double[] array2 = new double[0];
        System.out.println(array2.length);
        // System.out.println(array2[0]); // ArrayIndexOutOfBoundsException 에러 발생
    }
}
