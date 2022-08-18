package com.hp.design_pattern.ambassador;

/**
 * @author HP
 * @date 2022/8/18
 * @description
 */
public class RemoteService implements RemoteServiceInterface {
    private RemoteService() {
    }

    public static RemoteService getInstance() {
        return ContextHolder.INSTANCE;
    }

    private static class ContextHolder {
        private static final RemoteService INSTANCE = new RemoteService();
    }

    @Override
    public long doSomethingRemotely(int value) throws Exception {
        final long waitTime = (long) Math.floor(Math.random() * 1000);
        Thread.sleep(waitTime);
        return waitTime >= 200 ? waitTime : -1;
    }
}
