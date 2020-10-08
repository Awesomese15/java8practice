package com.home;

public class MultiThreadPriority  implements  Runnable{


    @Override
    public void run() {
        System.out.println("Running Thread......."+ Thread.currentThread().getName());
        System.out.println("Running Thread......."+ Thread.currentThread().getPriority());
    }

    public static  void main(String args []){
        MultiThreadPriority  multiThreadPriority= new MultiThreadPriority();
        Thread thread1=new Thread(multiThreadPriority);
        Thread thread2=new Thread(multiThreadPriority);
        Thread thread3=new Thread(multiThreadPriority);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
