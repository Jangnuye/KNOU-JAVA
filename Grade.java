public class Grade {
    int e;          // for english grade variable
    int m;          // for math grade variable

    void input_grade(int a, int b) {        // input grade method
        e = a;
        m = b;
    }

    void output_grade() {               // output total grade method
        System.out.println(e+m);
    }
}
