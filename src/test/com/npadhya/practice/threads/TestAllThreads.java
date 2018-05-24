package com.npadhya.practice.threads;

import org.testng.annotations.Test;

public class TestAllThreads {

    @Test
    public void testThreadByExtends() throws InterruptedException {
        ThreadByExtends threadByExtends = new ThreadByExtends();

        System.out.println("This is start call");
        threadByExtends.start();
        System.out.println(threadByExtends.getState());
        Thread.sleep(1500);
        threadByExtends.interrupt();
        System.out.println(threadByExtends.getState());
        System.out.println("This is run call directly");
        threadByExtends.run();
        System.out.println(threadByExtends.getState());
    }

    //@Test
    public static void main(String[] args)throws InterruptedException {
        Thread threadByImplements = new Thread(new ThreadByImplements());

        System.out.println("This is start call");
        threadByImplements.start();
        System.out.println(threadByImplements.getState());
        Thread.sleep(1500);
        threadByImplements.interrupt();
        System.out.println(threadByImplements.getState());
        System.out.println("This is run call directly");
        //threadByImplements.run();
        System.out.println(threadByImplements.getState());
    }

    @Test
    public void testThreadByInstantiation() throws InterruptedException {
        ThreadByInstantiation threadByInstantiation = new ThreadByInstantiation();

//        System.out.println("This is start call");
//        threadByInstantiation.start();
//        System.out.println(threadByInstantiation.getState());
//        Thread.sleep(1500);
//        threadByInstantiation.interrupt();
//        System.out.println(threadByInstantiation.getState());
        System.out.println("This is run call directly" + threadByInstantiation.hashCode());
        //threadByInstantiation.getThisThread().start();
        Thread.sleep(2500);
//        System.out.println(threadByInstantiation.getState());
    }
}
