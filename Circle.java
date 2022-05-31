class Circle implements Figure {
    private double radius;
    public Circle(double r) {radius = r;}
    public double getArea() {return radius*radius*3.141592;}
}
