package Num_21;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JsonFile implements ItemsStore {
    final String path = "src\\main\\java\\Num_21\\example.json";
    File file = new File(path);
    FileWriter fileWriter;
    Gson gson;

    public JsonFile() {
        gson = new Gson();
    }

    @Override
    public List<Item> getAll() {
        Type type = new TypeToken<List<Item>>(){}.getType();
        List<Item> items = null;
        try(FileReader fileReader = new FileReader(file)) {
            items = gson.fromJson(fileReader,type);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return items;
    }

    @Override
    public Item get(int id) throws IOException, InterruptedException {
        List<Item> items = getAll();
        for (Item i:items) {
            if(i.getId()==id){
                return i;
            }
        }
        return null;
    }

    @Override
    public Item addItem(Item item) throws IOException, InterruptedException {
        List<Item> items = getAll();
        item.setId(getNewId());
        items.add(item);
        sort(items);
        fileWriter = new FileWriter(path);
        fileWriter.write("[\n");
        for (Item i : items) {
            fileWriter.write(gson.toJson(i));
            if(items.indexOf(i) != items.size()-1){
                fileWriter.write(",");
            }
            fileWriter.write("\n");
        }
        fileWriter.write("\n]");
        fileWriter.close();
        return get(item.getId());
    }

    @Override
    public Item editItem(Item item, int id) throws IOException, InterruptedException {
        List<Item> items = getAll();
        items.removeIf(i->i.getId()==id);
        items.add(item);
        sort(items);
        fileWriter = new FileWriter(path);
        fileWriter.write("[\n");
        for (Item i:items) {
            fileWriter.write(gson.toJson(i));
            if(items.indexOf(i) != items.size()-1) {
                fileWriter.write(",");
            }
            fileWriter.write("\n");
        }
        fileWriter.write("\n]");
        fileWriter.close();
        return get(item.getId());
    }

    @Override
    public void deleteItem(int id) throws IOException, InterruptedException {
        List<Item> items = getAll();
        items.removeIf(i -> i.getId() == id);
        sort(items);
        fileWriter = new FileWriter(path);
        fileWriter.write("[\n");
        for (Item i:items) {
            fileWriter.write(gson.toJson(i));
            if(items.indexOf(i) != items.size()-1) {
                fileWriter.write(",");
            }
            fileWriter.write("\n");
        }
        fileWriter.write("\n]");
        fileWriter.close();
    }

    private void sort(List<Item> items){
        items.sort((o1, o2) -> (int) Math.signum(o1.getId()-o2.getId()));
    }
    private int getNewId(){
        List<Item> items = getAll();
        ArrayList<Integer> ids = new ArrayList<>();
        for (Item i: items)
            ids.add(i.getId());
        int id = 1;
        while(ids.contains(id)) id++;
        return id;
    }
}