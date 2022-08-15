package com.hp.design_pattern.active_object.request_senario;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public abstract class OneActiveObjectRequest<T> {

    protected final ActiveObject activeObject;
    protected final FutureResult<T> futureResult;


    public OneActiveObjectRequest(ActiveObject activeObject, FutureResult<T> futureResult) {
        this.activeObject = activeObject;
        this.futureResult = futureResult;
    }

    public abstract void execute();
}
