package com.halo;

import com.halo.framework.Product;
import com.halo.idcard.IDCardFactory;

/**
 * @author lanqilu
 * @date Created in 2020/12/03  21:33
 * @description
 */
public class Main {
    public static void main(String[] args) {
        IDCardFactory factory = new IDCardFactory();
        Product user1 = factory.create("小明");
        Product user2 = factory.create("小红");
        Product user3 = factory.create("小刚");
        user1.use();
        user2.use();
        user3.use();

    }
}
