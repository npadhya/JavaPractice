package com.npadhya.practice.concurrent;

import com.npadhya.practice.concurrency.ConcurrentProcessor;
import org.testng.annotations.Test;

public class ConcurrentProcessorTest {

    @Test
    public void processTest(){
        ConcurrentProcessor.process();
    }
}
