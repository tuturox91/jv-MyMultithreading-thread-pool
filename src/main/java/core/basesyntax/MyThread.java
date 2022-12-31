package core.basesyntax;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    @Override
    public String call() throws InterruptedException {
        int sleepTime = (new Random().nextInt(5)+ 1) * 100;
        Thread.sleep(sleepTime);
        return "Task duration was " +  sleepTime + "ms, execution finished at " + LocalTime.now();
    }
}
