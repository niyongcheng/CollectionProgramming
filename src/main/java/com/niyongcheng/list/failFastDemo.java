package com.niyongcheng.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;

public class failFastDemo {
    //private static List<String> list = new ArrayList<>();
    private static List<String> list = new CopyOnWriteArrayList();

    public static void main(String[] args){
        new Thread(()->{
            int i =0;
            while (i<6){
                list.add(String.valueOf(i));
                printAll();
                i++;
            }
        }).start();
        new Thread(()->{
            int i = 10;
            while (i<16){
                list.add(String.valueOf(i));
                printAll();
                i++;
            }
        }).start();
    }

    private static void printAll() {
        System.out.println("");

        String value = null;
        Iterator iter = list.iterator();
        while(iter.hasNext()) {
            value = (String)iter.next();
            System.out.print(value+", ");
        }
    }
}
