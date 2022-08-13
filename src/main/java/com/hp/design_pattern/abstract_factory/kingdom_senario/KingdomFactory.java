package com.hp.design_pattern.abstract_factory.kingdom_senario;

/**
 * @author HP
 * @date 2022/8/13
 * @description
 */
public interface KingdomFactory {
    Castle createCastle();

    King createKing();

    Army createArmy();
}
