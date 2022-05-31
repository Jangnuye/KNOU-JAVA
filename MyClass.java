public class MyClass {
    private int nMyField = 0;
    public void setMyField(int nNewField) {nMyField = nNewField;}
    public int getMyField() {return nMyField;}
    public static int nStaticField = 0;
    public static int nStaticField1 = 10;
    public static int nStaticField2;
    public MyClass() {nStaticField2 = 20;}
    /*3-9 메소드의 오버로딩 */
    public int add(int a, int b) {return a+b;}
    public double add(double a, double b) {return a+b;}
}