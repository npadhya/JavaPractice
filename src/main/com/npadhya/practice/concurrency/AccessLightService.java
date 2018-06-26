package com.npadhya.practice.concurrency;

import com.npadhya.practice.interfaces.MyConcurrentTasks;

public class AccessLightService implements MyConcurrentTasks {
    @Override
    public String call() throws Exception {
        System.out.println(MyConcurrentTasks.logNames());
        Thread.sleep(1210);
        return "AccessLightService returned";
    }
}
