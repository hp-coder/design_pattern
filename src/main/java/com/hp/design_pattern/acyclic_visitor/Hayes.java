package com.hp.design_pattern.acyclic_visitor;

/**
 * @author HP
 * @date 2022/8/15
 * @description
 */
public class Hayes extends Modem{
    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof HayesVisitor){
            ((HayesVisitor) modemVisitor).visit(this);
        }else{
            System.out.println(" Only HayesVisitor is allowed to visit Hayes Modem");
        }
    }
}
