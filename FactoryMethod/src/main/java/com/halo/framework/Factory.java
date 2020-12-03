package com.halo.framework;

/**
 * @author lanqilu
 * @date Created in 2020/12/03  21:20
 * @description
 */
public abstract class Factory {

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);

    public final Product create(String owner) {
        Product product = createProduct(owner);
        registerProduct(product);
        return product;
    }


}
