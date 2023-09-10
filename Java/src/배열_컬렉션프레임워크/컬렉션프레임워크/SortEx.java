package 배열_컬렉션프레임워크.컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        // sort(list) : list를 정렬
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
