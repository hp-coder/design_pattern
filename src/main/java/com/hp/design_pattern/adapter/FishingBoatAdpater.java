package com.hp.design_pattern.adapter;

/**
 * @author HP
 * @date 2022/8/18
 * @description
 */
public class FishingBoatAdpater implements RowingBoat{

    private final FishingBoat fishingBoat;

    public FishingBoatAdpater(FishingBoat fishingBoat) {
        this.fishingBoat = fishingBoat;
    }

    @Override
    public void row() {
        fishingBoat.sail();
    }
}
