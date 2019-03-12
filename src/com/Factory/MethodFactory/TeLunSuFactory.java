package com.Factory.MethodFactory;

import com.Factory.SimpleFactory.Milk;
import com.Factory.SimpleFactory.TeLunSu;

public class TeLunSuFactory implements MilkFactory{
    @Override
    public Milk createMilk() {
        return new TeLunSu();
    }
}
