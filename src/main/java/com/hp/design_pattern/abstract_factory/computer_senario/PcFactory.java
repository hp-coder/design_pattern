package com.hp.design_pattern.abstract_factory.computer_senario;

/**
 * @author HP
 * @date 2022/8/13
 * @description
 */
public class PcFactory implements ComputerAbstractFactory {


    private String ram;
    private String hdd;
    private String cpu;

    public PcFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
