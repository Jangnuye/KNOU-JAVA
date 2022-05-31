class Point implements Movable, Scalable {
    double x, y;
    public void add(double dx, double dy) {x+=dx; y+=dy;}
    public void sub(double dx, double dy) {x-=dx; y-=dy;}
    public void mul(double s) {x*=s; y*=s;}
    public void div(double s) {x/=s; y/=s;}
}
