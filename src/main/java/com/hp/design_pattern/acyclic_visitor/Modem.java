package com.hp.design_pattern.acyclic_visitor;

/**
 * @author HP
 * @date 2022/8/15
 * @description
 */
public abstract class Modem {
    public abstract void accept(ModemVisitor modemVisitor);
}
