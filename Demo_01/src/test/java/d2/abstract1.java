package d2;

import java.lang.reflect.InvocationTargetException;

public class abstract1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        a2 a2 = new a2();
        System.out.println(a2.a);
    }
}

abstract class a1 {
    int a = 1;

    public a1() {
    }

    public a1(int a) {
        this.a = a;
    }

    abstract void m1();
}

class a2 extends a1 {
    @Override
    void m1() {
        System.out.println("mm");
    }
}