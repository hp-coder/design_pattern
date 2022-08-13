package com.hp.design_pattern.abstract_document;

import java.util.Optional;

/**
 * @Author: HP
 */
public interface HasType extends Document{

    default Optional<String> getType(){
        return Optional.ofNullable(((String) get(Property.TYPE.toString())));
    }
}
