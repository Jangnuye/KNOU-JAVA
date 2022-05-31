public class StaticTest1 {
    public static void main(String args[]) {
        MyClass myObject1, myObject2;
        myObject1 = new MyClass();
        myObject2 = new MyClass();

        myObject1.nStaticField = 10;
        System.out.println(myObject2.nStaticField);
        myObject2.nStaticField += 10;
        System.out.println(myObject1.nStaticField);
    }
}
