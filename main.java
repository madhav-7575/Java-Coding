class main {
    static int calavg(int a, int b, int c) {
        int av;
        av = (a + b + c) / 3;
        return av;
    }

    static void getval(String a[]) {
        int p, m, c, avg;
        p = Integer.parseInt(a[0]);
        m = Integer.parseInt(a[1]);
        c = Integer.parseInt(a[2]);
        avg = calavg(p, m, c);
        System.out.println("Average: " + avg);
        printavg(avg);
    }

    static void printavg(int a) {
        if (a > 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String a[]) {
        if (a.length < 3) {
            System.out.println("Please enter 3 integer arguments.");
            return;
        }
        getval(a);
    }
}
