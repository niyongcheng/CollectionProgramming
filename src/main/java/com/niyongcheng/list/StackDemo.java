package com.niyongcheng.list;

import java.sql.ClientInfoStatus;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args){
        //Stack inheritance from Vector
        Stack s = new Stack();

        for(int i =1;i<6;i++){
            s.push(String.valueOf(i));
        }

        iteratorThroughRandomAccess(s);
    }

    private static void iteratorThroughRandomAccess(Stack s) {
        String val = null;
        for(int i =0;i< s.size();i++){
            val = (String)s.get(i);
            System.out.println(val + " ");
        }

        System.out.println();
    }
}
