public class AnonymousTest {
    /* public static void main(String args[]) {
        CSub sub = new CSub();
        sub.method1();
        sub.method2();
        sub.method3();
        System.out.println(sub.a);
        System.out.println(sub.b); */

    public static void main(String args[]) {
        MyInterface sub = new MyInterface() {
            @Override
            public void method() {System.out.println("sub1");}
            };
        sub.method();
    }
}
