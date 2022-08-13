package com.hp.design_pattern.abstract_factory.computer_senario;

/**
 * @author HP
 * @date 2022/8/13
 * @description
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
