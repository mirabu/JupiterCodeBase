package Multihreading;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;

//https://dribbble.com/shots/22977119-Chatify-AI-Chatbot-App-UI-Kit-Like-ChatGPT-Google-Bard
public class FutureCode {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<CompletableFuture<String>> futureList = new ArrayList<>();


        CompletableFuture<String> firstService = CompletableFuture.supplyAsync(() -> sleepRunThreadMethod("First",2000), executorService);
        CompletableFuture<String> secondService = CompletableFuture.supplyAsync(() -> sleepRunThreadMethod("second",4000), executorService);
        CompletableFuture<String> thirdService = CompletableFuture.supplyAsync(() -> sleepRunThreadMethod("third",6000), executorService);
        CompletableFuture<String> fourService = CompletableFuture.supplyAsync(() -> sleepRunThreadMethod("fourth",8000), executorService);
        CompletableFuture<String> fifthService = CompletableFuture.supplyAsync(() -> sleepRunThreadMethod("fifth",10000), executorService);
        CompletableFuture<String> sixthService = CompletableFuture.supplyAsync(() -> sleepRunThreadMethod("sixth",12000), executorService);
        CompletableFuture<String> seventhService = CompletableFuture.supplyAsync(() -> sleepRunThreadMethod("seventh",14000), executorService);

        futureList.add(firstService);
        futureList.add(secondService);
        futureList.add(thirdService);
        futureList.add(fourService);
        futureList.add(fifthService);
        futureList.add(sixthService);
        futureList.add(seventhService);

        System.out.println("Individual Future Result : ");
        for (CompletableFuture<String> future : futureList) {
            try {
                String result = future.get();
                System.out.println("Final Result :" + result);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private static String sleepRunThreadMethod(String value, int time) {
        try {
            Thread.sleep(time);
        }catch (InterruptedException interruptedException){
            Thread.currentThread().interrupt();
        }

        return value;
    }
}
