package com.npadhya.practice.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ConcurrentProcessor {



    public static boolean process(){
        long startTime = System.nanoTime();
        ExecutorService service = Executors.newFixedThreadPool(1);
        List<Callable> tasks = new ArrayList<Callable>();
        tasks.add(new AccessDB());
        tasks.add(new AccessFile());
        tasks.add(new AccessLightService());
        tasks.add(new AccessHeavyService());


        List<Future> futures = new ArrayList<Future>();

        for(Callable eachTask : tasks){
            Future<String> future = service.submit(eachTask);
            futures.add(future);
        }

        for(Future i : futures){
            try {
                System.out.println(i.get().toString()); // This is a blocking call
                System.out.println(System.nanoTime() - startTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.nanoTime();
        System.out.println((endTime-startTime)/1000);

        return false;
    }
}
