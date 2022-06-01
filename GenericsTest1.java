public class GenericsTest1 {
    public static void main(String args[]) {
        Data data = new Data();
        Integer i = new Integer(20);
        data.set(i);
        String s = (String)data.get();
    }
}
