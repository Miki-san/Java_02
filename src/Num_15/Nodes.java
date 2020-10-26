package Num_15;

import java.util.ArrayList;

public class Nodes {
    public int command;
    public ArrayList<Nodes> links;

    public Nodes(int command) {
        this.command = command;
    }

    public String getCommand() {
        switch (command) {
            case 1: {
                return "create_project";
                break;
            }
            case 2: {
                return "add_library";
                break;
            }
            case 3: {
                return "restart";
                break;
            }
            case 4: {
                return "test";
                break;
            }
            case 5: {
                return "deploy";
                break;
            }
            case 6: {
                return "drop_db";
                break;
            }
        }
        return "";
    }

    public void setCommand(int command) {
        this.command = command;
    }

    public ArrayList<Nodes> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<Nodes> links) {
        this.links = links;
    }
}
