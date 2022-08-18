package com.hp.design_pattern.adapter;

/**
 * @author HP
 * @date 2022/8/18
 * @description
 */
public class Captain {

    private final RowingBoat rowingBoat;

    public Captain(RowingBoat rowingBoat) {
        this.rowingBoat = rowingBoat;
    }

    public void row(){
        rowingBoat.row();
    }
}
