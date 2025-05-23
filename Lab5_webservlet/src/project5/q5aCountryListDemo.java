// 5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
// Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
// display them on console whenever the countries are selected on the list.

package project4a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class CountryListDemo {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Country List Example");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // List of countries
        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark",
                              "France", "Great Britain", "Japan", "Africa",
                              "Greenland", "Singapore"};

        // Create JList with countries
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(6);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add ListSelectionListener to print selected countries
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected Countries:");
                    for (String country : selectedCountries) {
                        System.out.println(country);
                    }
                    System.out.println();
                }
            }
        });

        // Add components to frame
        frame.add(new JLabel("Select Countries:"));
        frame.add(scrollPane);

        // Make frame visible
        frame.setVisible(true);
    }
}

