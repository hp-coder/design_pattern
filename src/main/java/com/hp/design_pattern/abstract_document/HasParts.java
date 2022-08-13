package com.hp.design_pattern.abstract_document;

import java.util.stream.Stream;

/**
 * @Author: HP
 */
public interface HasParts extends Document {

    default Stream<Part> getParts() {
        return children(Property.PARTS.toString(), Part::new);
    }
}
