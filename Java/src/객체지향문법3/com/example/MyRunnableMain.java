package 객체지향문법3.com.example;

public class MyRunnableMain {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable() {
            @Override
            public void run() {
                System.out.println("myrunnable run!");
            }
        };

        r.run();
    }
}
