package com.hp.design_pattern.abstract_factory.kingdom_senario;

/**
 * @author HP
 * @date 2022/8/13
 * @description
 */
public class TestUsage {

    public static void main(String[] args) {
        final App app = new App();
        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF));
        System.out.println("King: "+app.getKing().getDescription());
        System.out.println("Castle: "+app.getCastle().getDescription());
        System.out.println("Army: "+app.getArmy().getDescription());
        System.out.println();
        app.createKingdom(FactoryMaker.makeFactory(FactoryMaker.KingdomType.ORC));
        System.out.println("King: "+app.getKing().getDescription());
        System.out.println("Castle: "+app.getCastle().getDescription());
        System.out.println("Army: "+app.getArmy().getDescription());
    }
}
