package 배열_컬렉션프레임워크.배열;

/* 이차원 가변 배열의 선언과 초기화
타입[][] 변수명 = new 타입[행의수][];
변수명[행인덱스] = new 타입[열의수];
 */
public class Array10 {
    public static void main(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[2];
        array[1] = new int[3];

        array[0][0] = 0;
        array[0][1] = 1;

        array[1][0] = 2;
        array[1][1] = 3;
        array[1][2] = 4;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) { // 안쪽 반복문은 i가 0일때는 2번 반복되고, i가 1일때는 3번 반복됨
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
