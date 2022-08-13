package com.hp.design_pattern.abstract_document;

import java.util.Map;

/**
 * @Author: HP
 */
public class Car extends AbstractDocument implements HasModel, HasPrice, HasParts {
    public Car(Map<String, Object> properties) {
        super(properties);
    }

}
