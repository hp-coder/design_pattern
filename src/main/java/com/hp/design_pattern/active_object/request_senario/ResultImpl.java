package com.hp.design_pattern.active_object.request_senario;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public class ResultImpl<T> implements Result<T> {

    private final T data;

    public ResultImpl(T data) {
        this.data = data;
    }

    @Override
    public T getResultValue() {
        return this.data;
    }
}
