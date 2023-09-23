package org.example.SortedMapTask;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCreator<K,V> {
    public Map<String, Integer> create() throws FileNotFoundException {
        File file = new File("words.txt");
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        StringBuilder line = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        while (scanner.hasNextLine()){
            line.append(scanner.nextLine()).append(" ");
        }
        String[] words = line.toString().split(" ");

        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else
                map.put(word, (map.get(word) + 1));
        }
        return map;
    }
}
