public class GenericsTest3 {
    public static void main(String args[]) {
        Data<String> data = new Data<>();
        String s1 = new String("hello");
        data.set(s1);
        String s2 = data.get();
    }
}
