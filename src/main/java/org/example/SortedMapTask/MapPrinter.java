package org.example.SortedMapTask;

import java.util.*;

public class MapPrinter {
     public void print(Map<String, Integer> map){
         for (Map.Entry<String, Integer> entry : map.entrySet()) {
             System.out.println(entry.getKey() + " " + entry.getValue().toString());
         }
     }
    }

