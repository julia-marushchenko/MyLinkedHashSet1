// Java program with usage of LinkedHashSet

package com.set;

import java.util.LinkedHashSet;
import java.util.Spliterator;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating LinkedHashSet
        LinkedHashSet<String> set = new LinkedHashSet<>();

        // Checking if set is empty
        System.out.println("Set is empty: " + set.isEmpty());

        // Adding elements to set
        set.add("Asia");
        set.add("Africa");
        set.add("North America");
        set.add("South America");
        set.add("Antarctica");
        set.add("Europe");
        set.add("Australia");

        // Printing set values to console
        System.out.println(set);

        // Checking if set has element Europe
        System.out.println("Set consist Europe: " + set.contains("Europe"));

        // Checking if set has element Africa
        System.out.println("Set consist Africa: " + set.contains("Africa"));

        // Checking if set has element Antarctica
        System.out.println("Set consist Antarctica: " + set.contains("Antarctica"));

        // Checking if set is empty
        System.out.println("Set is empty: " + set.isEmpty());

        // Removing all elements from the set
        set.clear();

        // Checking if set is empty
        System.out.println("Set is empty: " + set.isEmpty());
    }
}