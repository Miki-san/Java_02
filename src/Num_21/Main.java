package Num_21;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ItemsStore storage;
        String command;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose storage type\n-by server\n-by file");
        command = scanner.next();
        command = command.toLowerCase();
        while(!command.equals("server") && !command.equals("file"))
        {
            System.out.println("Invalid type!");
            System.out.println("Choose storage type\n-by server\n-by file");
            command = scanner.next();
            command = command.toLowerCase();
        }
        if(command.equals("server")){
            storage = new JsonServer();
        } else {
            storage = new JsonFile();
        }
        System.out.println("Chosen storage type: by " + command);
        System.out.println("Type 'help' to see a list of available commands");
        while (true){
            command = scanner.next();
            switch (command){
                case "add":
                    int id;
                    String data, description;
                    boolean isGood;
                    System.out.print("Item id: ");
                    id = scanner.nextInt();
                    System.out.print("Item data: ");
                    data = scanner.next();
                    System.out.print("Is this item good: ");
                    isGood = scanner.nextBoolean();
                    System.out.print("Item description: ");
                    description = scanner.next();
                    System.out.println("Item added: " + storage.addItem(new Item(id, data, isGood, description)));
                    command = "";
                    break;

                case "get":
                    System.out.print("Enter item id: ");
                    int getId = scanner.nextInt();
                    Item respond = storage.get(getId);
                    if (respond == null) {
                        System.out.println("Item not found");
                    } else {
                        System.out.println(respond + " Description: " + respond.getDescription());
                    }
                    command = "";
                    break;

                case "getAll":
                    List<Item> items = storage.getAll();
                    for (Object i: items) {
                        System.out.println(i);
                    }
                    command = "";
                    break;

                case "edit":
                    System.out.print("Enter item id: ");
                    int edit_id = scanner.nextInt();
                    Item current_item = storage.get(edit_id);
                    int new_id;
                    String new_data, new_description;
                    boolean new_isGood;
                    System.out.println(current_item);
                    System.out.print("Enter new item id: ");
                    new_id = scanner.nextInt();
                    System.out.print("Enter new item data: ");
                    new_data = scanner.next();
                    System.out.print("Is this item good: ");
                    new_isGood = scanner.nextBoolean();
                    System.out.print("Enter new item description: ");
                    new_description = scanner.next();
                    storage.editItem(new Item(new_id, new_data, new_isGood, new_description), edit_id);
                    command = "";
                    break;

                case "delete":
                    System.out.print("Enter item id: ");
                    int delete_id = scanner.nextInt();
                    if(storage.get(delete_id)!=null)
                        System.out.println("Item with id " + delete_id + " was deleted");
                    storage.deleteItem(delete_id);
                    command = "";
                    break;

                case "help":
                    System.out.println("Available commands\n" +
                            "get - returns a specified item\n" +
                            "getAll - return all items in the storage\n" +
                            "add - add new item to the storage\n" +
                            "edit - edit the specified item\n" +
                            "delete - delete a specified item");
                    command = "";
                    break;


            }
            if (command != "") {
                System.out.println("Invalid command!");
                System.out.println("Type 'help' to see a list of available commands");
            }
        }
    }
}