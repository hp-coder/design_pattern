package com.hp.design_pattern.active_object.request_senario;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public class ActiveObjectImpl implements ActiveObject {
    @Override
    public Result<String> makeString(int times, char s) {
        String str = String.valueOf(s).repeat(Math.max(0, times));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResultImpl<>(str);
    }

    @Override
    public void displayString(String str) {
        System.out.println(str);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
