package com.atguigu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloWorld {

    private static final int INITCIAL_SIZE = 100;

    public HelloWorld() {
    }

    public static void main(String[] args){


        ArrayList list  = new ArrayList();
        System.out.println("HelloWorld!");
        list.add(0,123);

        method();

    }

    private static void method() {


        try {
            FileInputStream files = new FileInputStream("Hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


}
