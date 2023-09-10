package 배열_컬렉션프레임워크.배열;

// Arrays : 배열을 다룰 때 사용하는 유틸리티

public class Array14 {
    public static void main(String[] args) {
        int[] copyFrom = {1,2,3};

        int[] copyTo = java.util.Arrays.copyOf(copyFrom, copyFrom.length);

        // copyTo와 copyFrom은 서로 다른 배열 인스턴스를 참조한다
        if(copyTo == copyFrom) {
            System.out.println("copyTo == copyFrom");
        }else {
            System.out.println("copyTo != copyFrom");
        }

        for(int c : copyTo) {
            System.out.println(c);
        }

        System.out.println("-------------------------------------");

        int[] copyTo2 = java.util.Arrays.copyOf(copyFrom, 5);

        for(int c : copyTo2) {
            System.out.println(c);
        }
    }
}
