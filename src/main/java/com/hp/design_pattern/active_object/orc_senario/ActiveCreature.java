package com.hp.design_pattern.active_object.orc_senario;

import com.hp.design_pattern.active_object.request_senario.FutureResult;
import com.hp.design_pattern.active_object.request_senario.ResultImpl;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public abstract class ActiveCreature {

    private final BlockingQueue<Runnable> requests;
    private final String name;

    public String name() {
        return name;
    }

    public ActiveCreature(String name) {
        this.name = name;
        this.requests = new LinkedBlockingQueue<Runnable>();
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    requests.take().run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
    }


    public void eat(int i) throws InterruptedException {
        requests.put(() -> {
            System.out.println(requests.hashCode());
            System.out.println(name() + " is eating on "+ Thread.currentThread().getName() + " " + i);
            System.out.println(name() + " has finished eating on " + Thread.currentThread().getName() + " " + i);
        });
    }

    public void roam(int i) throws InterruptedException {
        requests.put(() -> {
            System.out.println(name() + " has started to roam the wastelands." + " " + i);
        });
    }


    public void give_birth(FutureResult<String> result) throws InterruptedException {
        requests.put(()->{
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String str = new Random().toString();
            System.out.println(name()+ " has given birth to "+ str);
            result.setResult(new ResultImpl<>(str));
        });
    }

}
