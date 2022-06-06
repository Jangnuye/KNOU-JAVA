public class CloneTest {
    public static void main(String args[]) {
        Box b1 = new Box(20,30);
        Box b2 = (Box) b1.clone();
        System.out.println(b2.width());
        System.out.println(b2.height());
    }
}
