package com.hp.design_pattern.active_object.request_senario;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public class DisplayStringClient extends Thread {

    private final ActiveObject activeObject;
    private final String text;

    public DisplayStringClient(ActiveObject activeObject, String text, String name) {
        super(name);
        this.activeObject = activeObject;
        this.text = text;
    }

    public DisplayStringClient(ActiveObject activeObject, String text) {
        this.activeObject = activeObject;
        this.text = text;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i<=10; i++) {
                activeObject.displayString(text);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
