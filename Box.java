class Box implements Figure {
    private double height, width;
    public Box(double h, double w) {height=h; width=w;}
    public double getArea() {return height*width*0.5;}
}
