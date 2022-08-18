package com.hp.design_pattern.ambassador;

/**
 * @author HP
 * @date 2022/8/18
 * @description
 */
public class AmbassadorService implements RemoteServiceInterface {
    private static final int RETRIES = 3;
    private static final int DELAY_MS = 3000;

    @Override
    public long doSomethingRemotely(int value) throws Exception {
        return safeCall(value);
    }

    private long checkLatency(int value) throws Exception {
        var startTime = System.currentTimeMillis();
        var result = RemoteService.getInstance().doSomethingRemotely(value);
        var timeTaken = System.currentTimeMillis() - startTime;
        System.out.println("latency is :" + timeTaken);
        return result;
    }

    private long safeCall(int value) throws Exception {
        var retries = 0;
        var result = (long) -1;

        for (int i = 0; i < RETRIES; i++) {
            if (retries >= RETRIES) {
                return -1;
            }
            if ((result = checkLatency(value)) == -1) {
                retries++;
                try {
                    Thread.sleep(DELAY_MS);
                } catch (InterruptedException ignore) {
                }
            } else {
                break;
            }
        }
        return result;
    }
}
