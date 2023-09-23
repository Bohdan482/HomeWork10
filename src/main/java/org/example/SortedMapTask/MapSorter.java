package org.example.SortedMapTask;


import java.util.*;

public class MapSorter {

    public Map<String, Integer> sort(Map<String, Integer> map){
        MyComparator comp=new MyComparator(map);

        Map<String,Integer> newMap = new TreeMap(comp);
        newMap.putAll(map);
        return newMap;
    }

    static class MyComparator implements Comparator {

        Map map;

        public MyComparator(Map map) {
            this.map = map;
        }

        public int compare(Object o1, Object o2) {

            return ((Integer) map.get(o2)).compareTo((Integer) map.get(o1));

        }
    }
}
