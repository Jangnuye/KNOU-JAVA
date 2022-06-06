import java.io.*;

public class ExceptionTest {
    public static void main(String args[]) {
        DataInputStream dis = new DataInputStream(System.in);
        try {
            int i = dis.readInt();
        } catch(EOFException e1) {
            System.out.println(e1.toString());
            System.out.println(e1.getStackTrace());
        } catch(IOException e2) {
            System.out.println(e2.toString());
            System.out.println(e2.getStackTrace());
        }
    }
}
