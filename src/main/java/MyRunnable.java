package main.java;

/**
 * Created by boxiaotong on 2017/4/14.
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        while (true) {
            try {
                new Thread().sleep(500);
                System.out.println("thread :" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
