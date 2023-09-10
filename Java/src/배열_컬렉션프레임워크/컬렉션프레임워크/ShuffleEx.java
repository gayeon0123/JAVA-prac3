package 배열_컬렉션프레임워크.컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        // shuffle(list) : list를 섞는다
        Collections.shuffle(list);

        for (
                int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
