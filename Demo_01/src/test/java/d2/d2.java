package d2;

import java.util.Comparator;
import java.util.TreeSet;

public class d2 {

    public static void main(String[] args) {
        //1。无参默认构造器,根据Key类型相关规则进行排序String实现了Comparable接口
        //2。希望添加的元素，按照字符串大小来排序
        //3。使用TreeSet提供的一个构造器，可以传入一个比较器
        //public TreeSet(Comparator<? super E> comparator) {
        //        this(new TreeMap<>(comparator));
        //    }用的还是TreeMap
        //
        //TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo((String) o2);
                //return ((String) o1).length() - ((String) o2).length();
            }
        });
        treeSet.add("jack");
        treeSet.add("tom");
        treeSet.add("a");
        treeSet.add("abc");//长度一样不会填进去
        treeSet.add("b");
        System.out.println(treeSet);

    }
}

