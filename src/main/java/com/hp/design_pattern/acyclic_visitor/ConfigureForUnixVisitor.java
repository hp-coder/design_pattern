package com.hp.design_pattern.acyclic_visitor;

/**
 * @author HP
 * @date 2022/8/15
 * @description
 */
public class ConfigureForUnixVisitor implements ZoomVisitor {
    @Override
    public void visit(Zoom zoom) {
        System.out.println(zoom + " used with UNIX configurator");
    }
}
