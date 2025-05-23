// 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
// Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
// display the capital of the countries on console whenever the countries are selected on the list.

package project4a;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;

public class CountryCapitalJList {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Country and Capital List");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // List of countries
        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"};

        // Create a JList with the countries
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(6);
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Map of countries and their capitals
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Varies by country");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Add ListSelectionListener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();
                    String capital = capitals.get(selectedCountry);
                    System.out.println("Capital of " + selectedCountry + " is " + capital);
                }
            }
        });

        // Add components to frame
        frame.add(scrollPane);

        // Make frame visible
        frame.setVisible(true);
    }
}
