package com.atguigu;

import com.atguigu.bean.Customer;

import java.util.ArrayList;

/**
 * @auther ssn_Celeste
 * @create 2020/2/10 - 8:27
 */
public class TestTemplate {


    /**
     * 客户id
     */
     private int id;
     /**
      * 客户姓名
      */
      private String name;
      
    //prsf
    //alt+enter添加依赖项
    private static final Customer CUSTOMER = new Customer();
    //prf
    public static final int NUM = 100;


    public void testupdate(){
       //生成的测试方法
    }


    public static void main(String[] args) {
        System.out.println("TestTemplate");
        System.out.println("args = [" + args + "]");
        int num1=10;
        System.out.println("num1 = " + num1);
        System.out.println("TestTemplate.main");
        System.out.println(num1);

        String[] arr = new String[]{"jerry","tommy","hanmeimei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }


        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }


        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            
        }

        for (int i = 0; i < list.size(); i++) {
            
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }

    
    public void method(){

        System.out.println("TestTemplate.method");
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        if (list == null) {
            
        }
        if (list != null) {
            
        }
        if (list == null) {

        }
        if (list != null) {

        }



    }

}
