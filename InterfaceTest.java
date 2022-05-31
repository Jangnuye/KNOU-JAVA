public class InterfaceTest {
    public static void main(String args[]) {
        Triangle t = new Triangle(3.0, 4.0);
        System.out.println(t.getArea());
        Figure figurel1, figurel2, figurel3;
        figurel1 = new Triangle(3.0, 4.0);
        System.out.println(figurel1.getArea());
        figurel2 = new Box(3.0, 4.0);
        System.out.println(figurel2.getArea());
        figurel3 = new Circle(3.0);
        System.out.println(figurel3.getArea());
    }
}
