public class RunnableTest2 {
    public static void main(String args[]) {
        Runnable runnable = () -> {
            System.out.println("my thread");
        };
        Thread thd = new Thread(runnable);
        thd.start();
    }
}
