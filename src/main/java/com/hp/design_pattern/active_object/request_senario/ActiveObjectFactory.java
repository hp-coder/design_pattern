package com.hp.design_pattern.active_object.request_senario;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public class ActiveObjectFactory {

    private ActiveObjectFactory(){}

    public static ActiveObject createActiveObjects(){
        final ActiveObjectThread<String> thread = new ActiveObjectThread<>(new ActiveObjectQueue<>());
        thread.start();
        return new ActiveObjectProxy(thread, new ActiveObjectImpl());
    }
}
