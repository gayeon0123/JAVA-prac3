package 배열_컬렉션프레임워크.배열;

/* 이차원 배열
타입[][] 변수명 = new 타입[행의수][열의수];
변수명[행인덱스][열인덱스] = 값;
*/

public class Array08 {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        array[0][0] = 0;
        array[0][1] = 1;
        array[0][2] = 2;

        array[1][0] = 3;
        array[1][1] = 4;
        array[1][2] = 5;

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
