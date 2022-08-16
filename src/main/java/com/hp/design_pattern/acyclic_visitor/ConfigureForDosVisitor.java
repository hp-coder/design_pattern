package com.hp.design_pattern.acyclic_visitor;

/**
 * @author HP
 * @date 2022/8/15
 * @description
 */
public class ConfigureForDosVisitor implements AllModemVisitor {
    @Override
    public void visit(Hayes hayes) {
        System.out.println(hayes + " used with DOS configurator");
    }

    @Override
    public void visit(Zoom zoom) {
        System.out.println(zoom + " used with DOS configurator");
    }
}
