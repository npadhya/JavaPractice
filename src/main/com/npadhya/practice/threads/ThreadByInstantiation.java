package com.npadhya.practice.threads;

public class ThreadByInstantiation {

    private Thread thisThread;

    ThreadByInstantiation(){
        thisThread = new Thread();
        thisThread.start();
    }

    public Thread getThisThread(){
        return thisThread;
    }

    private void run(){
        for(int i = 0 ; i < 10 ; i++){
            try{
                System.out.println("I am in ThreadByInstantiation : " + i);
                Thread.sleep(500);
            } catch (Exception e ){
                System.out.println(thisThread.getId() + " : " + thisThread.getName() + " : Is interrupted");
            }
        }
    }
}
