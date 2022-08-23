package d2;

abstract class a {
    a(int x) {
        System.out.println("抽象构造方法");
    }

    abstract void m1();
}

class b extends a {
    b(int x) {
        super(x);
        System.out.println("子类方法");
    }

    @Override
    void m1() {

    }
}

public class d {
    public static void main(String[] args) {
        b b = new b(10);
        b.m1();
    }
}
