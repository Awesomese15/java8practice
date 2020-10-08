package com.home;

public class MultiThreadingByExtending extends  Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Running the thread");
    }

    public  static void main(String args []){
        MultiThreadingByExtending  t1=new MultiThreadingByExtending();
        t1.start();
    }
}
