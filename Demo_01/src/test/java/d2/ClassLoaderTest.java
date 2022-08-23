package d2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try {
                String s = name.substring(name.lastIndexOf("." )+1) + ".class";
                    InputStream is = this.getClass().getResourceAsStream("s");

                if (is == null) {
                    return super.loadClass(name);
                }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return this.defineClass(name, b, 0, b.length);
                } catch (Exception e) {
                    throw new ClassNotFoundException();
                }
            }
        };
        Object obj = myLoader.loadClass("d2.ClassLoaderTest").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof ClassLoaderTest);
    }
}
