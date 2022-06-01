public class MultipleType {
    public static void main(String args[]) {
        Pair <String, Integer> p1;
        p1 = new OrderedPair <> ("Even",8);
        Pair <String, String> p2;
        p2 = new OrderedPair <> ("Hello","Java");
        System.out.println(p1.getKey());
        System.out.println(p1.getValue());
        System.out.println(p2.getKey());
        System.out.println(p2.getValue());
    }
}
