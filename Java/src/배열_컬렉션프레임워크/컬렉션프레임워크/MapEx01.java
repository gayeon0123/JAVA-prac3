package 배열_컬렉션프레임워크.컬렉션프레임워크;

// Map에서 값을 꺼내려면, key를 이용해서 값을 꺼낸다

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");
        map.put("k3", "안녕하세요.");

        System.out.println(map.get("k1"));
        System.out.println(map.get("k2"));
        System.out.println(map.get("k3"));
    }
}
