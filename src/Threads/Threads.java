package Threads;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.State.TERMINATED;

public class Threads {

    static int totalSum;
    static ArrayList<Integer> thread_count = new ArrayList<Integer>();

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i <  4; i++){
            final int localI = i;
            Thread thread = new Thread(() -> work(localI));
            thread.start();
            threads.add(thread);
            thread_count.add(0);
        }
        for (Thread t : threads) {
            t.join();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        for (Integer i : thread_count) {
            totalSum +=i ;
        }
        System.out.println("total sum: " + totalSum);
    }

    private static void work(int i) {
        long startTime = System.currentTimeMillis();
        long result = doHardWork(i, 100_000_000);
        long endTime = System.currentTimeMillis();
        System.out.println(i + ": " + result + " | " + (endTime-startTime));
    }

    private static long doHardWork(int start, int count) {
        long a = 0;
        int b = start * 1000;
        for (int i = 0; i < count; i++) {
            a += (b + i) * (b + i) * Math.sqrt(b + i);
            thread_count.set(start, thread_count.get(start)+1);
        }
        return a;
    }
}
