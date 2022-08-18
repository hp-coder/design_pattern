package com.hp.design_pattern.aggregator_microservices;

/**
 * @author HP
 * @date 2022/8/18
 * @description
 */
public class Product {

    private String title;
    private int productInventories;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProductInventories() {
        return productInventories;
    }

    public void setProductInventories(int productInventories) {
        this.productInventories = productInventories;
    }
}
