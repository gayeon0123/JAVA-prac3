package 배열_컬렉션프레임워크.배열;

public class Array04 {
    public static void main(String[] args) {
        // array1, array2는 아무 것도 참조하지 않고 있는 배열 타입
        ItemForArray[] array1;
        ItemForArray array2[];

        // array1, array2는 ItemForArray 배열을 5개 가리킬 수 있는 배열을 가짐
        array1 = new ItemForArray[5];
        array2 = new ItemForArray[5];

        array1[0] = new ItemForArray(500, "item01");
        array2[1] = new ItemForArray(1000, "item02");

        // array1의 0번째가 참조하는 객체의 getName()메소드를 호출
        System.out.println(array1[0].getName());

        ItemForArray i1 = new ItemForArray(500, "itemAAA");
        System.out.println(i1.getName());
    }
}
