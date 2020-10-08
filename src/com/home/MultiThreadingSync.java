package com.home;
class Table{
    synchronized void printTable(int n){
        for (int i=1; i<5; i++){
            System.out.println(i*n);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread1 implements Runnable{
    Table t ;

    public Thread1(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
    t.printTable(5);
    }
}

class Thread2 implements Runnable{
    Table t ;

    public Thread2(Table t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(100);
    }
}
public class MultiThreadingSync{

    public static  void main (String args []){
        Table table=new Table();
        Thread1 thread1=new Thread1(table);
        Thread2 thread2=new Thread2(table);

        Thread test1=new Thread(thread1);
        Thread test2=new Thread(thread2);
        test1.start();
        test2.start();
    }



}
