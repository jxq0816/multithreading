package main.java;

/**
 * Created by boxiaotong on 2017/4/14.
 */
public class MyThread extends Thread{
   @Override
    public void run() {
        super.run();
        while (true) {
            try {
                this.sleep(500);
                System.out.println("thread :" + this.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        MyThread threadOne = new MyThread();
        threadOne.start();
        new Thread(new MyRunnable()).start();
    }
}
