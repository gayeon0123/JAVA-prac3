package 객체지향문법3.생성자1;

// this() 생성자
//  : 자기자신을 참조할 때 사용하는 키워드
//  : 자기 자신의 생성자
//  : 생성자 안에서만 사용가능
//  : 생성자 안에서 super()생성자를 호출하는 코드 다음이나, 첫번째 줄에 위치해야 함

// 불변(Immutable) 객체
//  : 인스턴스가 만들어질 때 값을 넣어주고, getter메소드만 갖고 있는 객체
//  : ex) String객체 - String 내부의 값을 변화시키지 않음
public class User {
    private String email;
    private String password;
    private String name;

    // 생성자를 하나라도 만들게되면 기본생성자가 자동으로 안 만들어진다
    public User(String name, String email) {
        this(name, email, null);
    }

    // 생성자 오버로딩 (생성자를 여러번 생성 가능)
    //  : 생성자는 매개변수의 개수가 다르거나, 타입이 다르다면 여러개를 가질 수 있다
    public User(String name, String email, String password) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
