package com.niyongcheng.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args){
        List list = new ArrayList<String>();
        list.add("ABC");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println((String)iterator.next());
        }

        // 将ArrayList转换为数组
        String[] arr = (String[])list.toArray(new String[0]);
        for (String str:arr)
            System.out.println("str: "+ str);
    }
}
