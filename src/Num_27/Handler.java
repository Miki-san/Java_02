package Num_27;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Ref;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Handler {
    String url = "http://gitlessons2020.rtuitlab.ru:3000/reflectionTasks";
    HttpClient client = HttpClient.newHttpClient();
    Gson gson = new Gson();

    List<ReflectionTask> tasks = new ArrayList<>();
    Worker worker = new Worker();

    public Handler(Worker worker) {
        this.worker = worker;
    }


    public void getTasks() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        tasks = gson.fromJson(response.body(), new TypeToken<List<ReflectionTask>>(){}.getType());
    }

    public void doTasks(){
        List<Method> workerMethods = Arrays.stream(Worker.class.getMethods())
                .filter(method-> Arrays.stream(method.getAnnotations()).anyMatch(a -> a instanceof Task))
                .collect(Collectors.toList());


        for (ReflectionTask task:tasks) {
            for (Method method:workerMethods) {
                String taskType = task.getType();
                String methodType = method.getAnnotation(Task.class).name();
                if(taskType.equals(methodType)){
                    try {
                        method.invoke(worker, task.getData());
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
