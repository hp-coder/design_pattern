package com.hp.design_pattern.acyclic_visitor;

/**
 * @author HP
 * @date 2022/8/15
 * @description
 */
public class Zoom extends Modem{
    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof ZoomVisitor){
            ((ZoomVisitor) modemVisitor).visit(this);
        }else{
            System.out.println(" Only ZoomVisitor is allowed to visit Zoom Modem");
        }
    }
}
