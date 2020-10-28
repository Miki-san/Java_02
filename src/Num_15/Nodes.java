package Num_15;

import java.util.ArrayList;
import java.util.Arrays;

public class Nodes {
    private ArrayList<Integer> command = new ArrayList<>();
    private ArrayList<Nodes> links = new ArrayList<>();
    private final ArrayList<String> commands = new ArrayList<>();

    public Nodes() {
        String[] init_comm = {"create_project", "add_library", "restart", "test", "deploy", "drop_db"};
        this.commands.addAll(Arrays.asList(init_comm));
    }

    public void getCommand(int index) {
        System.out.println(commands.get(command.get(index) - 1));
    }

    public void setCommandToNode(int command, int index) {
        this.command.add(index, command); ;
    }

    public void setNewCommand(String command){
        this.commands.add(command);
    }

    public ArrayList<Nodes> getLinks() {
        return links;
    }

    public void addLink(Nodes link, int comm) {
        this.command.add(comm);
        this.links.add(link);
    }
}
