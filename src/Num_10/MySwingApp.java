package Num_10;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

class VerticalLayout implements LayoutManager {
    private Dimension size = new Dimension();

    @Override
    public void addLayoutComponent(String name, Component comp) {}

    @Override
    public void removeLayoutComponent(Component comp) {}

    @Override
    public Dimension preferredLayoutSize(Container c) {
        return calculateBestSize(c);
    }

    @Override
    public Dimension minimumLayoutSize(Container c) {
        return calculateBestSize(c);
    }

    @Override
    public void layoutContainer(Container container) {
        Component list[] = container.getComponents();
        int currentY = 5;
        for (int i = 0; i < list.length; i++) {
            Dimension pref = list[i].getPreferredSize();
            list[i].setBounds(5, currentY, pref.width, pref.height);
            currentY += 10;
            currentY += pref.height;
        }
    }

    private Dimension calculateBestSize(Container c)
    {
        Component[] list = c.getComponents();
        int maxWidth = 0;
        for (int i = 0; i < list.length; i++) {
            int width = list[i].getWidth();
            if ( width > maxWidth )
                maxWidth = width;
        }
        size.width = maxWidth + 5;
        int height = 0;
        for (int i = 0; i < list.length; i++) {
            height += 5;
            height += list[i].getHeight();
        }
        size.height = height;
        return size;
    }
}


public class MySwingApp extends JFrame {
    public MySwingApp() {
        setTitle("My swing app!!!");
        setSize(200, 175);

        JTextField field_a = new JTextField("                                                   ");
        JTextField field_b = new JTextField("                                                   ");

        List<JButton> buttons = new ArrayList<>();
        buttons.add(new JButton("+"));
        buttons.add(new JButton("-"));
        buttons.add(new JButton("*"));
        buttons.add(new JButton("/"));


        Label label_res = new Label("                                                   ");

        for (JButton but : buttons) {
            but.addActionListener(action -> {
                double a, b;
                try {
                    a = Double.parseDouble(field_a.getText());
                    b = Double.parseDouble(field_b.getText());
                    switch (but.getText()) {
                        case "+":
                            label_res.setText("= " + (a + b));
                        case "-":
                            label_res.setText("= " + (a - b));
                        case "*":
                            label_res.setText("= " + (a * b));
                        case "/":
                            label_res.setText("= " + (a / b));
                    }
                } catch (Exception ex) {
                    label_res.setText(ex.toString());
                }
            });
        }

        JPanel main_panel = new JPanel(new VerticalLayout());
        List<JPanel> panels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            panels.add(new JPanel());
        }

        GridLayout layout = new GridLayout(1, 1);
        int k = 0;
        for (JPanel pan : panels) {
            pan.setLayout(layout);
            if (k == 1) {
                layout.setColumns(4);
            } else {
                layout.setColumns(1);
            }
            k++;
        }

        panels.get(0).add(field_a);
        for (JButton but : buttons) {
            panels.get(1).add(but);
        }
        panels.get(2).add(field_b);
        panels.get(3).add(label_res);

        for (JPanel pan : panels) {
            main_panel.add(pan);
        }

        add(main_panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
