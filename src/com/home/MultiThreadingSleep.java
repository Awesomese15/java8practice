package com.home;

public class MultiThreadingSleep extends  Thread{
    public void run(){
        for(int i=0; i<10; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public static  void main(String args []){
        MultiThreadingSleep multiThreadingSleep=new MultiThreadingSleep();
        MultiThreadingSleep multiThreadingSleep2=new MultiThreadingSleep();
        multiThreadingSleep.start();
        multiThreadingSleep2.start();
    }
}
