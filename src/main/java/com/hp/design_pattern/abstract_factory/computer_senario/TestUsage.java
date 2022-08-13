package com.hp.design_pattern.abstract_factory.computer_senario;

/**
 * @author HP
 * @date 2022/8/13
 * @description
 */
public class TestUsage {

    public static void main(String[] args) {
        final Computer pc = ComputerFactory.getComputer(new PcFactory("2 GB", "500 GB", "2.4 GHz"));
        final Computer server = ComputerFactory.getComputer(new PcFactory("16 GB", "1000 GB", "3.2 GHz"));

        System.out.println(pc.toString());
        System.out.println(server.toString());
    }
}
