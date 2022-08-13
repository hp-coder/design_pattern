package com.hp.design_pattern.abstract_factory.kingdom_senario;

/**
 * @author HP
 * @date 2022/8/13
 * @description
 */
public class App {

    Army army;

    Castle castle;

    King king;

    public Army getArmy() {
        return army;
    }

    public Castle getCastle() {
        return castle;
    }

    public King getKing() {
        return king;
    }

    public void createKingdom(KingdomFactory kingdomFactory) {
        this.army = kingdomFactory.createArmy();
        this.castle = kingdomFactory.createCastle();
        this.king = kingdomFactory.createKing();
    }
}
