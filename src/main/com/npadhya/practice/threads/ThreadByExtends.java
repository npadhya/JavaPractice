package com.npadhya.practice.threads;

public class ThreadByExtends extends Thread {

    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            try{
                System.out.println("I am in ThreadByExtends : " + i);
                Thread.sleep(500);
            } catch (Exception e ){
                System.out.println(this.getId() + " : " + this.getName() + " : Is interrupted");
            }
        }
    }
}
