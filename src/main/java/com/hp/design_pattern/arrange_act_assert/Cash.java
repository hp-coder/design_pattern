package com.hp.design_pattern.arrange_act_assert;

/**
 * @author HP
 * @date 2022/8/30
 */
public class Cash {
    private Integer amount;

    public Cash(Integer amount) {
        this.amount = amount;
    }

    public void plus(int added){
        amount += added;
    }

    public boolean minus(int subtrahend){
        if (amount>= subtrahend){
            amount-= subtrahend;
            return true;
        }else{
            return false;
        }
    }

    public int count(){
        return amount;
    }
}
