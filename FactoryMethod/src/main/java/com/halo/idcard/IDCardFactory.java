package com.halo.idcard;

import com.halo.framework.Factory;
import com.halo.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lanqilu
 * @date Created in 2020/12/03  21:29
 * @description
 */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();


    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
