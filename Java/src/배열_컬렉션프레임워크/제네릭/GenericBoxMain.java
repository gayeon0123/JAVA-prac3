package 배열_컬렉션프레임워크.제네릭;

public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>(); // String 타입을 사용 -> GenericBox<T>에서 T에 String이 들어가게 된다
        genericBox.add("kim");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(new Integer(5)); // 컴파일 오류가 발생한다.
        Integer intValue = intBox.get();
        System.out.println(intValue);

        GenericBox<Object> object = new GenericBox<>();
        object.add("hello");
        String str2 = (String)object.get();
        System.out.println(str2);
    }
}
