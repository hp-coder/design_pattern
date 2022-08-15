package com.hp.design_pattern.active_object.request_senario;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public class ActiveObjectThread<T> extends Thread {
    private final ActiveObjectQueue<T> queue;

    public ActiveObjectThread(ActiveObjectQueue<T> queue) {
        this.queue = queue;
    }

    public void addThings(OneActiveObjectRequest<T> request) {
        queue.put(request);
    }

    @Override
    public void run() {
        while (true) {
            queue.take().execute();
        }
    }
}

