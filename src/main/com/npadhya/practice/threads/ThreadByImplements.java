package com.npadhya.practice.threads;

public class ThreadByImplements implements Runnable{

    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            try{
                System.out.println("I am in ThreadByImplements : " + i);
                Thread.sleep(500);
            } catch (Exception e ){
                System.out.println("Thread interrupted");
            }
        }
    }
}
