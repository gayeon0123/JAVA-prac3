package 배열_컬렉션프레임워크.컬렉션프레임워크;

import java.util.ArrayList;

public class ListEx01 {
    public static void main(String[] args) {

        // 자료구조객체들은 제네릭을 사용하지 않으면 Object타입을 저장한다
        //  -> Object타입은 꺼낼 때 (String)타입으로 형변환을 해줘야한다
        ArrayList list = new ArrayList();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = (String)list.get(0);
        String str2 = (String)list.get(1);
        String str3 = (String)list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
