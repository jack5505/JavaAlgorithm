package com.company.thread;

/*
 *
 *  @author Sabirov Jakhongir
 *
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for(int i = 1 ; i <= 10 ;i ++){
            new Thread(i + ""){
                @Override public void run() {
                    System.out.println("running " + getName() + "  running");
                }
            }.start();
        }

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);

        thread.start();

        try {
            Thread.sleep(10L * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        myRunnable.doStop();
    }
}
