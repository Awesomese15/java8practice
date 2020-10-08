package com.home;

public class MultiThreadingByImpl implements Runnable{

    @Override
    public void run() {
        System.out.println("Runing...............................");
    }

    public static void main(String  args []){
        MultiThreadingByImpl multiThreadingBy=new MultiThreadingByImpl();
        Thread t2= new Thread(multiThreadingBy);
        t2.start();
    }
}
