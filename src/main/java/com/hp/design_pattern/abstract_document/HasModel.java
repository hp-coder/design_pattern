package com.hp.design_pattern.abstract_document;

import java.util.Optional;

/**
 * @Author: HP
 */
public interface HasModel extends Document{

    default Optional<String> getModel(){
        return Optional.ofNullable(((String) get(Property.MODEL.toString())));
    }
}
