package com.hp.design_pattern.active_object.orc_senario;

import com.hp.design_pattern.active_object.request_senario.FutureResult;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public class App {

    public static void main(String[] args) {
        final App app = new App();
        app.run();
    }

    private int creatures = 10;

    public void run() {
        ActiveCreature creature;
        try {
            for (int i = 0; i < creatures; i++) {
                creature = new Orc(Orc.class.getSimpleName() + i);
                creature.eat(1);
                final FutureResult<String> result = new FutureResult<>();
                creature.give_birth(result);
                final String resultValue = result.getResultValue();
                System.out.println(resultValue);
                creature.roam(22);
            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        Runtime.getRuntime().exit(1);
    }
}
