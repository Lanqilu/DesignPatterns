package com.halo.demo1;

/**
 * @author lanqilu
 * @date Created in 2020/11/29  19:54
 * @description 使用继承的适配器
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}


