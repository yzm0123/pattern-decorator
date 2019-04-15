package com.gupaoedu.vip.pattern.decorator.battercake.v1;

public class BatterCakeWithEgg extends BatterCake {

    @Override
    protected String getMsg() {
        return super.getMsg() + "➕一个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
