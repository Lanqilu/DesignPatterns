package com.halo.demo2;

import com.halo.demo1.Banner;

/**
 * @author lanqilu
 * @date Created in 2020/11/29  20:06
 * @description
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
