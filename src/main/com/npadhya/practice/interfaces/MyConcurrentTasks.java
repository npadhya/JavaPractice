package com.npadhya.practice.interfaces;

import java.util.concurrent.Callable;

public interface MyConcurrentTasks extends Callable<String> {

    static String logNames(){
        return "Logging : ";
    }

}
