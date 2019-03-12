package com.Factory.SimpleFactory;

public class MilkFactoryTest {
    public static void main(String[] args) {
//        TeLunSu teLunSu = new TeLunSu();
//        teLunSu.createMile();
        MilkFactory milkFactory = new MilkFactory();
        Milk milk = MilkFactory.createMilk("циеё");
        milk.createMilk();
    }
}
