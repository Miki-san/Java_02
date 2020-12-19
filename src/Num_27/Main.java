package Num_27;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Handler handler = new Handler(new Worker());
        handler.getTasks();
        handler.doTasks();
    }
}
