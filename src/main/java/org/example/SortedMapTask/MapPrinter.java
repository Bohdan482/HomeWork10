package org.example.SortedMapTask;

import java.util.*;

public class MapPrinter {
    public void print(Map<String, Integer> map) {

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        Iterator<Map.Entry<String, Integer>> i = set.iterator();


        while (i.hasNext()) {

            Map.Entry<String, Integer> mp = (Map.Entry)i.next();
            System.out.print(mp.getKey() + " ");
            System.out.println(mp.getValue());

        }
    }
}
