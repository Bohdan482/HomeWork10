package org.example.UserTask;

import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Outputer {
    public void output() throws IOException {
        User user = new User();
        BufferedWriter writer = new BufferedWriter(new FileWriter("user.gson"));
        writer.write(user.createGson());
        writer.close();
    }
}
