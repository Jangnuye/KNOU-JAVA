public class RunnableTest1 {
    public static void main(String args[]) {
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("my thread");
            }
        };
        Thread thd = new Thread(runnable);
        thd.start();
    }
}
