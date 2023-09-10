package 배열_컬렉션프레임워크.컬렉션프레임워크;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListEx03 {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();
        collection.add("kim"); // collection.add() 메서드
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size()); // collection.size() 메서드

        Iterator<String> iter = collection.iterator();
        while(iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }
}
