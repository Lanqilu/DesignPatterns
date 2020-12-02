package com.halo.demo1;

/**
 * @author lanqilu
 * @date Created in 2020/11/29  19:58
 * @description
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
