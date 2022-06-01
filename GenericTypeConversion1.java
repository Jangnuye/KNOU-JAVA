public class GenericTypeConversion1 {
    public static void main(String args[]) {
        Data<Number> data = new Data<Number>();
        data.set(new Integer(10));
        data.set(new Double(10.1));
    }
}
