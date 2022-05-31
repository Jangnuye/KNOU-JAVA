public class InheritTest {
    public static void main(String args[]) {
        CSub sub = new CSub();
        sub.f2 = 50;
        sub.f4 = 70;
        sub.setPrivate();
        sub.setPublic();
        sub.mPrivate();
    }
}
