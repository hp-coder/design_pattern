package com.hp.design_pattern.active_object.request_senario;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public class MakeStringClient extends Thread {
    private final ActiveObject activeObject;
    private final char characters;

    public MakeStringClient(ActiveObject activeObject, char characters, String name) {
        super(name);
        this.activeObject = activeObject;
        this.characters = characters;
    }

    public MakeStringClient(ActiveObject activeObject, char characters) {
        this.activeObject = activeObject;
        this.characters = characters;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                final Result<String> result = activeObject.makeString(i + 1, characters);
                Thread.sleep(200);
                System.out.println(Thread.currentThread().getName() + " use make is: " + result.getResultValue());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
