public class Cylinder {
    private Circle c;           // 밑면
    private int h;              // 높이
    public Cylinder(Circle a, int b) {
        c = a;
        h = b;
    }
    public double getVolume() {
        return c.getArea() * h;
    }
}
