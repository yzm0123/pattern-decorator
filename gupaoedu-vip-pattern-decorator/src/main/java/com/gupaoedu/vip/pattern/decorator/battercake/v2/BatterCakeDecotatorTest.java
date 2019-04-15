package com.gupaoedu.vip.pattern.decorator.battercake.v2;

public class BatterCakeDecotatorTest {
    public static void main(String[] args) {

        AbstractBatterCake batterCake = new BaseBatterCake();
        //一个煎饼，啥都不加
        System.out.println(batterCake.getMsg() + ",总价格为:" + batterCake.getPrice());

        //加一个鸡蛋
        batterCake = new BatterCakeWithEggDecotator(batterCake);
        System.out.println(batterCake.getMsg() + ",总价格为:" + batterCake.getPrice());
        //再加一个鸡蛋
        batterCake = new BatterCakeWithEggDecotator(batterCake);
        System.out.println(batterCake.getMsg() + ",总价格为:" + batterCake.getPrice());
        //再加一根香肠
        batterCake = new BatterCakeWithHotDog(batterCake);
        System.out.println(batterCake.getMsg() + ",总价格为:" + batterCake.getPrice());

        //用装饰器之后，可以满足客户不同的要求
    }
}
