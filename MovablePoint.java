class MovablePoint implements Movable {
    double x, y;
    public void add(double dx, double dy) {x+=dx; y+=dy;}
    public void sub(double dx, double dy) {x-=dx; y-=dy;}
}
