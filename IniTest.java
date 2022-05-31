public class IniTest {
    int nNormal1 = 10, nNormal2 = 20;           // 선언?
    static int nStatic1 = 50, nStatic2 = 60;
    {
        /* static 필드 선언문의 초기화 구문 */
        nNormal1 = 30;
        nNormal2 = 40;
    }
    static  {
        /* static 초기화 블록 */
        nStatic1 = 70;
        nStatic2 = 80;
    }
         /* non static 필드의 초기화 구문 실행 */
    public IniTest() {
        nNormal1 = 100;
        nNormal2 = 200;
        nStatic1 = 300;
        nStatic2 = 400;
    }
}
