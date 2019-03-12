package com.Factory.AbstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        MengNiu mengNiu = new MengNiu();
        mengNiu.createMilk().createMilk();
        mengNiu.createMilkBook().sendBook();
        mengNiu.createMilkStar().starName();
    }
}
