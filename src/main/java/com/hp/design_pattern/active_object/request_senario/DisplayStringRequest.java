package com.hp.design_pattern.active_object.request_senario;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public class DisplayStringRequest extends OneActiveObjectRequest<String> {

    private final String text;

    public DisplayStringRequest(ActiveObject activeObject, String text) {
        super(activeObject, null);
        this.text = text;
    }

    @Override
    public void execute() {
        activeObject.displayString(text);
    }
}
