package com.hp.design_pattern.abstract_factory.computer_senario;

/**
 * @author HP
 * @date 2022/8/13
 * @description
 */
public abstract class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("RAM=").append(getRAM()).append(", ")
                .append("HDD=").append(getHDD()).append(", ")
                .append("CPU=").append(getCPU());
        sb.append('}');
        return sb.toString();
    }
}
