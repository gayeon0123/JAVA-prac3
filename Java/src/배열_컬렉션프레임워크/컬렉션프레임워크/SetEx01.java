package 배열_컬렉션프레임워크.컬렉션프레임워크;

// key들이 모두 모이면 -> Set 자료구조
// Set 자료구조에서 모든 것을 꺼내려면 Iterator를 사용한다

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

//        set.add("hello");
//        set.add("hi");
//        set.add("hong");
//        set.add("hong"); // 중복되는 내용은 한번만 출력됨

        Boolean flag1 = set.add("hello");
        Boolean flag2 = set.add("hi");
        Boolean flag3 = set.add("hong");
        Boolean flag4 = set.add("hong"); // 중복되는 내용은 한번만 출력됨
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) { // 다음에 꺼낼 것이 없을 때까지 반복
            String str = iter.next();
            System.out.println(str);
        }
    }
}
