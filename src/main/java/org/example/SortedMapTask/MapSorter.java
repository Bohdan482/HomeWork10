package org.example.SortedMapTask;


import java.util.*;

public class MapSorter {

    public  <String, Integer extends Comparable<? super Integer>>
    List<Map.Entry<String, Integer>> sort(Map<String, Integer> map) {

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(map.entrySet());

        Collections.sort(sortedEntries,
                (e1, e2) -> e2.getValue().compareTo(e1.getValue())
        );
        return sortedEntries;
    }
}
