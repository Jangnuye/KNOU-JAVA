public class GradeOutput {
        int e;          // for english grade variable
        int m;          // for math grade variable

        void input_grade(int a, int b) {        // input grade method
        e = a;
        m = b;
    }

        void output_grade() {               // output total grade method
        System.out.println(e+m);
    }

        public static void main(String args[]) {
        Grade g1, g2;       // object representing two grades
        g1 = new Grade();   // make variable
        g2 = new Grade();
        g1.input_grade(90, 85);     // input grade
        g2.input_grade(80, 80);

        g1.output_grade();      // output total grade
        g2.output_grade();
    }
}
