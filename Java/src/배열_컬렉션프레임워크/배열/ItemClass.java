package 배열_컬렉션프레임워크.배열;

import java.util.Arrays;
import java.util.Comparator;

public class ItemClass {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("java", 5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("C#", 4500);
        items[3] = new Item("자바스크립트", 6000);
        items[4] = new Item("Dart", 2000);

        // sort(Object[]) - Object는 모든 객체의 조상이므로, 어떤 객체의 배열이든 볼 수 있다
        // 람다 : 메소드가 1개만 있는 인터페이스 구현 시 사용 가능
        Arrays.sort(items, new ItemSorter()); // new ItemSorter() : 정렬방법 정의

        for(Item item : items) {
            System.out.println(item);
        }
    }
}

class ItemSorter implements Comparator {

    // compare : o1 - o2 해서 '양수, 0, 음수'로 결과가 나온다
    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item)o1;
        Item item2 = (Item)o2;
        return item1.getName().compareTo(item2.getName());
    }
}

// Comparable : 어떤 Item이 큰지, 작은지 기준을 정하는 interface
class Item implements Comparable {
    private String name;
    private int price;

    public Item (String name, int price){
        this.name = name;
        this.price = price;
    }

    // compareTo : 파라미터로 들어온 Object와 내 자신을 비교하는 메소드
    //           : Object를 받아들이도록 했지만, 실제로는 Item이 들어온다
    //           : '양수, 0, 음수' 중에서 결과가 나온다
    @Override
    public int compareTo(Object o) {
        Item d = (Item)o;
        return this.price = d.price; // 내 자신의 name과 지금 들어온 name을 비교
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
