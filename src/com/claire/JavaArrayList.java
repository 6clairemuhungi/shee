package com.claire;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList();
        names.add("John");
        names.add("Lucy");
        names.add("Mary");
        names.add("Henry");
        names.add("Brian");

        System.out.println(names.get(1) );

        names.remove(2);

        System.out.println(names.size());

        names.clear();

        System.out.println(names.size());

        //how to accerss functions from another class, start with the name of the class
        //eg:

        Functions.areaCircle(6);
        //it will calculate the are on this file




    }
}
