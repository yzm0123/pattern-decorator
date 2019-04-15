package com.gupaoedu.vip.pattern.decorator.battercake.v2;

public class BatterCakeWithEggDecotator extends AbstractBatterCakeDecotator {

    public BatterCakeWithEggDecotator(AbstractBatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "➕鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
