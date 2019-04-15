package com.gupaoedu.vip.pattern.decorator.battercake.v2;

public abstract class AbstractBatterCakeDecotator extends AbstractBatterCake {

    private AbstractBatterCake batterCake;

    public AbstractBatterCakeDecotator(AbstractBatterCake batterCake) {
        this.batterCake = batterCake;
    }

    @Override
    protected String getMsg() {
        return batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return batterCake.getPrice();
    }
}
