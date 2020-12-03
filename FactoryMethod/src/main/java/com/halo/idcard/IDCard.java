package com.halo.idcard;

import com.halo.framework.Product;

/**
 * @author lanqilu
 * @date Created in 2020/12/03  21:26
 * @description
 */
public class IDCard extends Product {

    private String owner;

    IDCard(String owner) {
        System.out.println("制作" + owner + "的ID卡");
        this.owner = owner;
    }


    @Override
    public void use() {
        System.out.println("使用" + owner + "的ID卡");
    }

    public String getOwner() {
        return owner;
    }
}
