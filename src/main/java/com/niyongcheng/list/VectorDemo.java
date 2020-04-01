package com.niyongcheng.list;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){
        //Vector中的操作是线程安全的。
        //its api use synchronized to ensure the thread safety
        //Vector支持4种遍历方式。建议使用下面的第二种去遍历Vector，因为效率问题。
/*        (02) 第二种，随机访问，通过索引值去遍历。
        由于Vector实现了RandomAccess接口，它支持通过索引值去随机访问元素。*/
        Vector<String> vec = new Vector<>();

        // 添加元素
        vec.add("1");
        vec.add("2");
        vec.add("3");
        vec.add("4");
        vec.add("5");

        // 设置第一个元素为100
        vec.set(0, "100");
        // 将“500”插入到第3个位置
        vec.add(2, "300");
        System.out.println("vec:"+vec);
    }
}
