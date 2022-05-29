public class BlockTest {                // class definition block
    public static void main(String args[]) {         // method definition block
        int a = 0, b = 0, c;
        {
            int d = 0, e, f;
            a = a+b;
            {
                d++;
            }
        }
    }
}
