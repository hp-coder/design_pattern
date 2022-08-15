package com.hp.design_pattern.active_object.request_senario;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public class MakeStringRequest extends OneActiveObjectRequest<String> {
    private final int count;
    private final char characters;

    public MakeStringRequest(ActiveObject activeObject, FutureResult<String> futureResult, int count, char characters) {
        super(activeObject, futureResult);
        this.count = count;
        this.characters = characters;
    }

    @Override
    public void execute() {
        futureResult.setResult(activeObject.makeString(count, characters));
    }
}
