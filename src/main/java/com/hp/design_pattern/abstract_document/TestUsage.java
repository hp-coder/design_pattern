package com.hp.design_pattern.abstract_document;

import java.util.List;
import java.util.Map;

/**
 * @Author: HP
 */
public class TestUsage {

    public static void main(String[] args) {

        var wheelProperties = Map.of(
                Property.TYPE.toString(), "wheel",
                Property.MODEL.toString(), "15c",
                Property.PRICE.toString(), 100L
        );

        var doorProperties = Map.of(
                Property.TYPE.toString(), "door",
                Property.MODEL.toString(), "lambo",
                Property.PRICE.toString(), 300L
        );

        var carProperties = Map.of(
                Property.MODEL.toString(), "300SL",
                Property.PRICE.toString(), 10000L,
                Property.PARTS.toString(), List.of(wheelProperties, doorProperties)
        );

        final Car car = new Car(carProperties);
        System.out.println("car model: " + car.getModel().orElseThrow());
        System.out.println("car price: " + car.getPrice().orElseThrow());
        car.getParts().forEach(p -> {
            System.out.print("parts: "+ p.getType().orElse(null)+" / ");
            System.out.print(p.getModel().orElse(null)+ " / ");
            System.out.println(p.getPrice().orElse(null));
        });
    }
}
