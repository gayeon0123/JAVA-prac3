package 배열_컬렉션프레임워크.컬렉션프레임워크;

import java.util.ArrayList;
import java.util.List;

public class ListEx02 {
    public static void main(String[] args) {

        // 제네릭을 사용해서 String타입으로 지정해주면 -> 꺼낼 때 String으로 형변환 할 필요 없다
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
