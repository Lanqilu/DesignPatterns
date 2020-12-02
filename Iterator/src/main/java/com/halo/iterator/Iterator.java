package com.halo.iterator;

/**
 * @author lanqilu
 * @date Created in 2020/11/28  21:11
 * @description 用于遍历集合中的元素
 */
public interface Iterator {
    /**
     * 判断是否存在下一个元素
     *
     * @return boolean
     */
    public abstract boolean hasNeat();

    /**
     * 返回下一个元素的同时将迭代器移动至下一个元素
     *
     * @return Object 返回集合中的一个元素
     */

    public abstract Object next();
}
