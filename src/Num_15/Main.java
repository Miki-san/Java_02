package Num_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        ArrayList<Nodes> nodes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            nodes.add(new Nodes());
        }
        nodes.get(0).addLink(nodes.get(1), 1);
        nodes.get(0).addLink(nodes.get(4), 2);
        nodes.get(1).addLink(nodes.get(2), 4);
        nodes.get(1).addLink(nodes.get(3), 6);
        nodes.get(2).addLink(nodes.get(3), 6);
        nodes.get(2).addLink(nodes.get(4), 2);
        nodes.get(3).addLink(nodes.get(2), 3);
        nodes.get(3).addLink(nodes.get(4), 5);
        nodes.get(4).addLink(nodes.get(0), 5);
        nodes.get(4).addLink(nodes.get(2), 3);
        Nodes current_node = new Nodes();
        current_node = nodes.get(0);
        n = Integer.parseInt(in.next());
        while (n != -1) {
            current_node.getCommand(n);
            current_node = current_node.getLinks().get(n);
            n = Integer.parseInt(in.next());
        }
    }
}
