package com.hp.design_pattern.abstract_document;

import java.util.Map;

/**
 * @Author: HP
 */
public class Part extends AbstractDocument implements HasModel, HasPrice, HasType {

    public Part(Map<String, Object> properties) {
        super(properties);
    }
}
