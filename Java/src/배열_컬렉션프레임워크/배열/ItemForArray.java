package 배열_컬렉션프레임워크.배열;

/*
참조형 배열 : 배열의 타입이 기본형이 아닌 경우
          : 배열 변수가 참조하는 배열의 공간이 값을 저장하는 것이 아니라, 값을 참조한다는 것을 의미함
 */

// ItemForArray는 불변 클래스이다
//   : 생성할 때 값을 넣어주고, 그 이후에 값을 바꿀 수 없는 클래스
public class ItemForArray {
    private int price;
    private String name;

    public ItemForArray(int price, String name) {
        // ItemForArray()를 초기화
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
