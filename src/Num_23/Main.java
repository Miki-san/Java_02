package Num_23;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        List<JsonObject> tasks = new ArrayList<>();
        while(true){
            worker.getTasks(tasks);
            worker.doTasks(tasks);
            try {
                Thread.sleep((int) ((Math.random() + 1) * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
