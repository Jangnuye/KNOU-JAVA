public class InitStatic {
    public static void main(String args[]) {
        MyClass mc1 = new MyClass();
        System.out.println("mc1 is constructed.");
        System.out.println("nStaticFiled1 : " + mc1.nStaticField1);
        System.out.println("nStaticField2 : " + mc1.nStaticField2);
        MyClass.nStaticField1 += 10;
        MyClass.nStaticField2 += 10;
        System.out.println("Values are changed.");
        System.out.println("nStaticField1 : " + mc1.nStaticField1);
        System.out.println("nStaticField2 : " + mc1.nStaticField2);
        MyClass mc2 = new MyClass();
        System.out.println("mc2 is constructed.");
        System.out.println("nStaticField1 :" + mc1.nStaticField1);
        System.out.println("nStaticField2 :" + mc2.nStaticField2);
    }
}
