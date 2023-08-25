package 객체지향문법1;

public class VendingMachineMain {
    public static void main(String[] args) {
        // static이 붙은 메소드 : '클래스 메소드'라고 부름
        //                    : 인스턴스를 생성하지 않아도 사용 가능

        // 클래스명 변수명 = new 클래스명();
        // 클래스명 : 참조타입
        // 변수명 : 참조변수
        // new 연산자
        // 클래스명() : 생성자

        // 메모리상에 인스턴스를 2개 생성
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);

        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);

        // static한 메소드는 인스턴스를 생성하지 않아도 호출할 수 있다
        //                 레퍼런스변수명.static메소드() 로 호출
        vm1.printVersion();

        // 지역 변수 : 메소드 안에 선언된 변수
        //          : 메소드가 실행될 때 생성되었다가 메소드가 종료될 때 사라진다
    }
}

// javac VendingMachine.java
// javac VendingMachineMain.java
// java VendingMachineMain

// JVM은 클래스를 어디서 찾아서 실행할까? (VendingMachineMain은 어디서 찾아서 실행할까?)
//  -> JVM(Java Virtual Machine)은 CLASSPATH 경로에서 클래스를 찾아서 실행한다
//                                 (현재 폴더/경로에서 찾아서 실행 x)