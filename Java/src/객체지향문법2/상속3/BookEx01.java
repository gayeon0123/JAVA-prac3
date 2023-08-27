package 객체지향문법2.상속3;

public class BookEx01 {
    public static void main(String[] args) {
        Book b1 = new Book();

//        b1.price = 100; // private 필드는 System.out.println(b1.price); 여기에 직접 접근하지 못한다
//        System.out.println(b1.price);

        b1.setPrice(500);
        System.out.println(b1.getPrice());

        b1.setName("자바");
        System.out.println(b1.getName());
    }
}
