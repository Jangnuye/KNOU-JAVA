public class AppendTest {
    public static void main(String args[]) {
        String szStr1 = "선발투수";
        StringBuffer sbBuffer = new StringBuffer(szStr1);
        sbBuffer.append(' ').append("빅친호");
        szStr1 = sbBuffer.toString();
    }
}
