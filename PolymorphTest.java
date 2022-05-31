public class PolymorphTest {
    public static void main(String args[]) {
        A a = new B();
        a.func();
        a = new C();
        a.func();
    }
}
