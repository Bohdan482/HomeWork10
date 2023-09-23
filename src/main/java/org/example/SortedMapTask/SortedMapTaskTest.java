package org.example.SortedMapTask;

import java.io.FileNotFoundException;

public class SortedMapTaskTest {
    public static void main(String[] args) throws FileNotFoundException {
        MapCreator<String, Integer> mapCreator = new MapCreator<>();
        MapPrinter mapPrinter = new MapPrinter();
        mapPrinter.print(mapCreator.create());
    }
}
