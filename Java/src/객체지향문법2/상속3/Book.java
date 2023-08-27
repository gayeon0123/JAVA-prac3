package 객체지향문법2.상속3;

public class Book {
//    public int price;

    private int price; // price 필드(field)
    private String title;

    // 필드의 값을 수정하고 얻기 위한 메소드를 만든다 : setter, getter
    // * setter, getter : 프로퍼티(property)

    // price 프로퍼티
    public int getPrice() {
        return this.price * 2; // this : 내 자신 인스턴스를 참조하는 예약어
        // static 메소드는 인스턴스 없어도 생성되므로, static 메소드에서는 this를 사용 불가능
    }

    public void setPrice(int price) { // 지역변수 price
        this.price = price;
        // price : 지역변수
        // this.price : 인스턴스 변수
    }

    // Name 프로퍼티
    public String getName() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }
}
