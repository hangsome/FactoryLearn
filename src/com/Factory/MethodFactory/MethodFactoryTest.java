package com.Factory.MethodFactory;

import com.Factory.SimpleFactory.Milk;

public class MethodFactoryTest {
    public static void main(String[] args) {

        MengNiuFactory mengNiuFactory = new MengNiuFactory();
        Milk mengNiu = mengNiuFactory.createMilk();
        mengNiu.createMilk();

        TeLunSuFactory teLunSuFactory = new TeLunSuFactory();
        Milk teLunSu = teLunSuFactory.createMilk();
        teLunSu.createMilk();
    }

}
