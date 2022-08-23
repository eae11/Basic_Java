public class Test01 {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";
        //System.out.println(s1 == s2);
        //String s3 = "aa";//池里创建
        String s = new String("aa");//堆里创建
        String intern = s.intern();//入池,池里有了返回池里的对象,池里没有在池里新创建一个对象返回池里的
        //System.out.println(intern == s);
        String s4 = "aa";
        //System.out.println(s4 == intern);


    }
}
