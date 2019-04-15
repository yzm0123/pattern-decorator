package com.gupaoedu.vip.pattern.decorator.battercake.v1;

public class BatterCakeWithHotDog extends BatterCake {
    @Override
    protected String getMsg() {
        return super.getMsg() + "➕ 一根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
