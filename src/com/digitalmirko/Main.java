package com.digitalmirko;

// Iterating though an ArrayList using Methods: hasNext & next

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();
        myList.add("Objective-C");
        myList.add("Swift");
        myList.add("Java");
        myList.add("Python");
        myList.add("XML");
        Iterator<String> itor = myList.iterator();
        while(itor.hasNext()) {
            System.out.println(itor.next());
        }
    }
}

/*
Output:
Objective-C
Swift
Java
Python
XML
 */