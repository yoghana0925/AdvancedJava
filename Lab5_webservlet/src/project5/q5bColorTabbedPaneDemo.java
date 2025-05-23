// 5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
// display the concerned color whenever the specific tab is selected in the Pan.

package project4a;

import javax.swing.*;
import java.awt.*;

public class q5bColorTabbedPaneDemo {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Color TabbedPane Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each tab with specific background colors
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs to the TabbedPane
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add TabbedPane to the frame
        frame.add(tabbedPane);

        // Make frame visible
        frame.setVisible(true);
    }
}
