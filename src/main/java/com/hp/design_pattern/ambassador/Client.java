package com.hp.design_pattern.ambassador;

/**
 * @author HP
 * @date 2022/8/18
 * @description
 */
public class Client {

    private final AmbassadorService ambassadorService = new AmbassadorService();

    public long useService(int value) throws Exception {
        return ambassadorService.doSomethingRemotely(value);
    }
}
