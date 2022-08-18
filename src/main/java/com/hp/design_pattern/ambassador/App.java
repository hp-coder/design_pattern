package com.hp.design_pattern.ambassador;

/**
 * @author HP
 * @date 2022/8/18
 * @description
 */
public class App {
    public static void main(String[] args) throws Exception {
        final Client client1 = new Client();
        final Client client2 = new Client();
        client1.useService(12);
        client1.useService(50);
    }
}
