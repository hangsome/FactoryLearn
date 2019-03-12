package com.Factory.AbstractFactory;

public class MengNiuStarFactory implements MilkStar{
    @Override
    public void starName() {
        System.out.println("这是蒙牛品牌代言的明星");
    }
}
