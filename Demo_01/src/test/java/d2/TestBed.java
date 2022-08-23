
package d2;

public class TestBed {
    public void f() {
        System.out.println("f()");
    }


    public static class Tester {
        int i = 6;

        public Tester(int i) {
            this.i = i;
        }

        public static void main(String[] args) {
            TestBed t = new TestBed();
            Tester tester = new Tester(6);

            t.f();
        }
    }


    public static void main(String[] args) {
        System.out.println("...");
    }
}