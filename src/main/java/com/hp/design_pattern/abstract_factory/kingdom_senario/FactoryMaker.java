package com.hp.design_pattern.abstract_factory.kingdom_senario;

import java.util.Objects;

/**
 * @author HP
 * @date 2022/8/13
 * @description
 */
public class FactoryMaker {

    public static KingdomFactory makeFactory(KingdomType type) {
        if (Objects.equals(type, KingdomType.ELF)) {
            return new ElfKingdomFactory();
        } else if (Objects.equals(type, KingdomType.ORC)) {
            return new OrcKingdomFactory();
        } else {
            throw new IllegalArgumentException("Kingdom Type not supported.");
        }
    }


    public enum KingdomType {
        ELF, ORC
    }
}
