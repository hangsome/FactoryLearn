package com.Factory.MethodFactory;

import com.Factory.SimpleFactory.MengNiu;
import com.Factory.SimpleFactory.Milk;

public class MengNiuFactory implements MilkFactory{
    @Override
    public Milk createMilk() {
        return new MengNiu();
    }
}
