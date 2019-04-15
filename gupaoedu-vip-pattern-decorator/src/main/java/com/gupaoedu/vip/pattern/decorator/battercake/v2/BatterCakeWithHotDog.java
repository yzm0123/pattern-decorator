package com.gupaoedu.vip.pattern.decorator.battercake.v2;

public class BatterCakeWithHotDog extends AbstractBatterCakeDecotator {
    public BatterCakeWithHotDog(AbstractBatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "➕ 一根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
