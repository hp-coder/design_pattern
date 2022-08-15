package com.hp.design_pattern.active_object.request_senario;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public class ActiveObjectProxy implements ActiveObject {

    private final ActiveObjectThread<String> thread;
    private final ActiveObject activeObject;

    public ActiveObjectProxy(ActiveObjectThread<String> thread, ActiveObject activeObject) {
        this.thread = thread;
        this.activeObject = activeObject;
    }

    @Override
    public Result<String> makeString(int times, char s) {
        final FutureResult<String> futureResult = new FutureResult<>();
        thread.addThings(new MakeStringRequest(activeObject, futureResult, times, s));
        return futureResult;
    }

    @Override
    public void displayString(String str) {
        thread.addThings(new DisplayStringRequest(activeObject, str));
    }
}
