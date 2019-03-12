package com.Factory.AbstractFactory;

public class MengNiu extends AbstractMilkFactory {
    @Override
    MilkBook createMilkBook() {
        return new MengNiuBookFactory();
    }

    @Override
    MilkStar createMilkStar() {
        return new MengNiuStarFactory();
    }

    @Override
    MengNiuFactory createMilk() {
        return new MengNiuFactory();
    }
}
