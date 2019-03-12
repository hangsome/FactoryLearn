package com.Factory.SimpleFactory;

class MilkFactory {
    public static Milk createMilk(String name){
        if(name == "льбьку"){
            return new TeLunSu();
        }else if (name == "циеё"){
            return new MengNiu();
        }
        return null;
    }
}
