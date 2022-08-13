package com.hp.design_pattern.abstract_document;

import java.util.Optional;

/**
 * @Author: HP
 */
public interface HasPrice extends Document{

    default Optional<Number> getPrice(){
        return Optional.ofNullable(((Number) get(Property.PRICE.toString())));
    }
}
