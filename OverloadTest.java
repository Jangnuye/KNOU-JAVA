public class OverloadTest {
    public static void main(String args[]) {
        MyClass mc = new MyClass();
        System.out.println(mc.add(10, 15));
        System.out.println(mc.add(10.5, 15.3));
        System.out.println(mc.add(10, 10.5));
    }
}
