package com.hp.design_pattern.active_object.request_senario;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public class App {

    public static void main(String[] args) {
        final ActiveObject activeObjects = ActiveObjectFactory.createActiveObjects();
        new DisplayStringClient(activeObjects,"内容1","thread1").start();
        new DisplayStringClient(activeObjects,"内容2","thread2").start();
        new DisplayStringClient(activeObjects,"内容3","thread3").start();
        new DisplayStringClient(activeObjects,"内容4","thread4").start();

        new MakeStringClient(activeObjects, 'a', "t1").start();
        new MakeStringClient(activeObjects, 'b', "t2").start();
        new MakeStringClient(activeObjects, 'c', "t3").start();
        new MakeStringClient(activeObjects, 'd', "t4").start();
    }
}
