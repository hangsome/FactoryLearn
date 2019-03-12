package com.Factory.AbstractFactory;

public class MengNiuBookFactory implements MilkBook{
    @Override
    public void sendBook() {
        System.out.println("这是蒙牛品牌的书");
    }
}
