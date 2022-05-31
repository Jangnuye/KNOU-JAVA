public class CSub extends CSuper {
    private int f3;
    public int f4;
    /* this와 super 사용 예시 단락 */
    public double x;
    public CSub(double new_x) {
        this.x = new_x;
        super.x = new_x * 10;
    }
    public double getSuper() {return super.x;}
    public double gerSub() {return this.x;}
}
