package com.hp.design_pattern.active_object.request_senario;

/**
 * @author HP
 * @date 2022/8/14
 * @description
 */
public interface ActiveObject {

    Result<String> makeString(int times, char s);

    void displayString(String str);
}
