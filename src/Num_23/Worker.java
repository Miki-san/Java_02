package Num_23;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.*;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    HttpClient httpClient = HttpClient.newHttpClient();
    String sendURL = "http://gitlessons2020.rtuitlab.ru:3000/reports";
    final String path = "src\\Num_23\\db.json";
    String getURL = "http://gitlessons2020.rtuitlab.ru:3000/tasks";
    File file = new File(path);
    FileWriter fileWriter;
    FileReader fileReader;
    JsonReader jsonReader;
    Gson gson = new Gson();
    List<Integer> ready_id = new ArrayList<>();

    public void getTasks(List<JsonObject> tasks) {
        tasks.clear();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(getURL))
                .build();
        HttpResponse<String> response = null;
        try {
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException exception) {
            exception.printStackTrace();
        }
        JsonArray new_tasks = gson.fromJson(response.body(), JsonArray.class);
        for (JsonElement object : new_tasks) {
            tasks.add(object.getAsJsonObject());
        }
    }

    public double Calculation(String expression){
        double a, b;
        String sign;
        DecimalFormat dm = new DecimalFormat("#.##");
        expression = expression.replace(" ", "");
        String regular = "(?<=\\d)(?=\\D)|(?<=\\D)(?=\\D)|(?<=\\d\\D)(?=\\d)";
        String[] splitted = expression.split(regular);
        a = Integer.parseInt(splitted[0]);
        b = Integer.parseInt(splitted[2]);
        sign = splitted[1];
        switch (sign) {
            case "+" -> {
                return a + b;
            }

            case "-" -> {
                return a - b;
            }

            case "*" -> {
                return a * b;
            }

            case "/" -> {
                double r = a/b;
                String res = dm.format(r);
                res = res.replace(",", ".");
                r = Double.parseDouble(res);
                return r;
            }
        }
        return 0;
    }

    public void doTasks(List<JsonObject> tasks) {
        for (JsonObject task : tasks) {
            if (!ready_id.contains(task.get("id").getAsInt())) {
                System.out.println(task.get("taskDescription") + " performed.");
                double taskRes = Calculation(task.get("expression").getAsString());
                sendReport(task.get("id").getAsInt(), taskRes);
                ready_id.add(task.get("id").getAsInt());
                try (FileWriter fileWriter = new FileWriter(path)) {
                    fileWriter.write("[");
                    fileWriter.write(gson.toJson(ready_id));
                    fileWriter.write("]");
                    fileWriter.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void sendReport(int taskId, double result) {
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(new Reporter(taskId, result))))
                .uri(URI.create(sendURL))
                .setHeader("Content-Type", "application/json")
                .build();
        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
        }catch (IOException | InterruptedException e){
            e.printStackTrace();
        }
    }

    Worker(){
        try {
            fileWriter = new FileWriter(file, true);
            fileReader = new FileReader(file);
            jsonReader = gson.newJsonReader(fileReader);
            if(fileReader.read() == -1){
                fileWriter.write("[]");
                fileWriter.flush();
            }
            Type type = new TypeToken<List<Integer>>(){}.getType();
            ready_id = gson.fromJson(jsonReader, type);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
