package com.npadhya.practice.concurrency;

import com.npadhya.practice.interfaces.MyConcurrentTasks;

public class AccessFile implements MyConcurrentTasks {
    @Override
    public String call() throws Exception {
        System.out.println(MyConcurrentTasks.logNames());
        Thread.sleep(590);
        return "AccessFile Returned";
    }
}
