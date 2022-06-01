public class RunnableTest {
    public static void main(String args[]) {
        Thread thd = new Thread(new MyThread());
        thd.start();
    }
}
