package com.gupaoedu.vip.pattern.decorator.battercake.v1;

public class BatterCakeTest {

    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getMsg() +",总价格为：" + batterCake.getPrice());

        batterCake = new BatterCakeWithEgg();
        System.out.println(batterCake.getMsg() +",总价格为：" + batterCake.getPrice());

        batterCake = new BatterCakeWithHotDog();
        System.out.println(batterCake.getMsg() +",总价格为：" + batterCake.getPrice());

        //这里，如果煎饼要加鸡蛋和香肠，那么又得添加一个类,
        //如果要加2个鸡蛋，又得加一个类

    }
}
