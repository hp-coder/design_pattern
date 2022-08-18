package com.hp.design_pattern.aggregator_microservices;

/**
 * @author HP
 * @date 2022/8/18
 * @description
 */
public class Aggregator {

    private final ProductInventoryClient productInventoryClient;
    private final ProductInformationClient productInformationClient;

    public Aggregator(ProductInventoryClient productInventoryClient, ProductInformationClient productInformationClient) {
        this.productInventoryClient = productInventoryClient;
        this.productInformationClient = productInformationClient;
    }

    public Product getProduct(){
        final Product product = new Product();
        product.setProductInventories(productInventoryClient.getInventories());
        product.setTitle(productInformationClient.getTitle());
        return  product;
    }
}
