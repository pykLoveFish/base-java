package com.base.java.jvm.gctest.out.memory;

/**
 * 测试多线程溢出
 * @author tangwei
 * @date 2019/1/23 10:31
 */
public class JavaVmStackOOM {

    private void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVmStackOOM oom = new JavaVmStackOOM();
        oom.stackLeakByThread();
    }

}
