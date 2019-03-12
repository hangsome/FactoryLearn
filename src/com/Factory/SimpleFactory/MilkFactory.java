package com.Factory.SimpleFactory;

class MilkFactory {
    public static Milk createMilk(String name){
        if(name == "������"){
            return new TeLunSu();
        }else if (name == "��ţ"){
            return new MengNiu();
        }
        return null;
    }
}
