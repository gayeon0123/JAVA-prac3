package 객체지향문법3.com.example;

public class MyRunnableMain2 {
    public static void main(String[] args) {

        /* 방법 1
        MyRunnable myRunnable = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("hello!");
            }
        };

        RunnableExecute runnableExecute = new RunnableExecute();
        System.out.println("---------");
        runnableExecute.execute(myRunnable);
        // myRunnable이 실행되는 과정 : execute() 안에서 myRunnable이 갖고있는 run()메소드가 호출됨
        System.out.println("---------");

         */

        /* 방법 2
        RunnableExecute runnableExecute = new RunnableExecute();
        System.out.println("---------");
        runnableExecute.execute(new MyRunnable() {
            @Override
            public void run() {
                System.out.println("hello!");
            }
        });
        System.out.println("---------");

         */

        // 방법 3
        RunnableExecute runnableExecute = new RunnableExecute();
        System.out.println("---------");

        // 이름 없는 객체를 줄여씀
        // () -> {
        //        System.out.println("hello!");
        //        }
        runnableExecute.execute(() -> {
            System.out.println("hello!");
        });
        System.out.println("---------");

        /* 람다 인터페이스 - 메소드를 하나만 가지고 있는 인터페이스
                        - 메소드를 한 개만 가지고 있다
         */

    }
}
