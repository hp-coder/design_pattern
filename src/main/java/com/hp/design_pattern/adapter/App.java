package com.hp.design_pattern.adapter;

/**
 * @author HP
 * @date 2022/8/18
 * @description
 */
public class App {

    public static void main(String[] args) {
        final Captain captain = new Captain(new FishingBoatAdpater(new FishingBoat()));
        captain.row();
    }
}
