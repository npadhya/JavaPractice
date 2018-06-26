package com.npadhya.practice.concurrency;

import com.npadhya.practice.interfaces.MyConcurrentTasks;

public class AccessHeavyService implements MyConcurrentTasks {
    @Override
    public String call() throws Exception {
        System.out.println(MyConcurrentTasks.logNames());
        Thread.sleep(2800);
        return "AccessHeavyService returned";
    }
}
