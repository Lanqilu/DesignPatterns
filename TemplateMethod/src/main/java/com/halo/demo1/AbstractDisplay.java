package com.halo.demo1;

/**
 * @author lanqilu
 * @date Created in 2020/12/03  20:30
 * @description
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void dispaly() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
