package com.npadhya.practice.concurrency;

import com.npadhya.practice.interfaces.MyConcurrentTasks;

public class AccessDB implements MyConcurrentTasks {


    @Override
    public String call() throws Exception {
        System.out.println(MyConcurrentTasks.logNames());

        Thread.sleep(360);

        return "AccessDB returned";
    }
}
