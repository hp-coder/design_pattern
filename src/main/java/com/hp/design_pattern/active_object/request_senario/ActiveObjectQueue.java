package com.hp.design_pattern.active_object.request_senario;

import java.util.LinkedList;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public class ActiveObjectQueue<T> {
    private final static int MAX_SIZE = 5;
    private final LinkedList<OneActiveObjectRequest<T>> queue;

    public ActiveObjectQueue() {
        this.queue = new LinkedList<>();
    }

    public synchronized void put(OneActiveObjectRequest<T> oneActiveObjectRequest) {
        while (queue.size() >= MAX_SIZE) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            queue.add(oneActiveObjectRequest);
            this.notifyAll();
        }
    }

    public synchronized OneActiveObjectRequest<T> take() {
        while (queue.isEmpty()) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        return queue.removeFirst();
    }
}
