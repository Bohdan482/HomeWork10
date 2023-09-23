package org.example.UserTask;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.Scanner;

public class User {
    private String name;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String createGson() throws IOException {
            File file = new File("file.txt");
            FileReader fileReader = new FileReader(file);
            Scanner scanner = new Scanner(fileReader);
            String json = "";

        scanner.nextLine();
        while (scanner.hasNextLine()) {

                User user = new User();
                user.setName(scanner.next());

                user.setAge(Integer.parseInt(scanner.next()));
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                 json += gson.toJson(user);

        }
        return json;
        }
    }
