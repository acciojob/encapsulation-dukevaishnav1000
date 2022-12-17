package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj=new RWOnly();

        //obj.name="rikku";
        //System.out.println(obj.name);
        obj.setter("rikku");
        System.out.println(obj.getter());
    }
}