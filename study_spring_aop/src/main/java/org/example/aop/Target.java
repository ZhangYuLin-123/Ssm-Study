package org.example.aop;

public class Target implements TargetInterface{

    public void save() {
        System.out.println("saving......");
        System.out.println(1/0);
    }
}
