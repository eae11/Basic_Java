package d2;

public class Father {
    public static int i = 1;
    int q=2;

    static {
        System.out.println("父类的静态代码块{}执行了。。。");
        System.out.println();
    }

    {
        System.out.println("父类的非静态代码块{}执行了。。。");
        System.out.println();
    }

    public Father() {
        System.out.println("父类的无参构造structure 执行了。。。");
        System.out.println();
    }

    public Father(String name, Integer age) {
        //super(); 默认执行父类的无参构造
        this.name = name;
        this.age = age;
        System.out.println("父类的有参构造structure 执行了。。。");
        System.out.println();
    }

    public static void Read() {
        System.out.println("父类的静态Read方法执行了。。。");
        System.out.println();
    }

    public void tour() {
        System.out.println("父类的非静态tour方法执行了。。。");
        System.out.println();
    }

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}