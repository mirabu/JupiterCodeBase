package Multihreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Account{
    String accName;
    long balance;

    Account (String accName, long balance){
        this.accName=accName;
        this.balance=balance;
    }

    public synchronized String transferTo(Account receiver, long amount){
        if (this.balance >= amount){
            this.balance=this.balance-amount;
            receiver.balance=receiver.balance+amount;
            return ""+amount+" transfer from  "+this.accName+" to "+receiver.accName;
        }else{
            return "Transition Failed!";
        }
    }

    public String toString() {
        return accName + ": ₹" + balance;
    }}


public class FutureDisable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Account jugal = new Account("Jugal",2000);
        Account ronaldo = new Account("ronaldo",3000);

        ExecutorService service = Executors.newFixedThreadPool(10);
        List<CompletableFuture<String>> futureList = new ArrayList<>();

        CompletableFuture<String> firstTransaction = CompletableFuture.supplyAsync( ()-> jugal.transferTo(ronaldo,500),service );
        futureList.add(firstTransaction);

        System.out.println("First Transaction..");
        for (CompletableFuture<String> future : futureList){
           try {
               String result = future.get();
               System.out.println(result);
           }catch (Exception e){
               e.printStackTrace();
           }
        }
        System.out.println("Final balance");
        System.out.println(jugal);
        System.out.println(ronaldo);








    }
}
