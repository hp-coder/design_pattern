package com.hp.design_pattern.abstract_factory.kingdom_senario;

/**
 * @author HP
 * @date 2022/8/13
 * @description
 */
public class ElfArmy implements Army {
    public static final String DESCRIPTION = "This is the elven castle!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
