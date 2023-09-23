package org.example.ReaderTask;
import java.io.*;


public class ReaderClass {
    public static void main(String[] args) throws IOException {
        {
            try {
                File file = new File("file");
                FileReader fileReader = new FileReader(file);
                BufferedReader reader = new BufferedReader(fileReader);

                String line = reader.readLine();
                String replaced = "";
                while (line != null) {
                    char[] temp = line.toCharArray();
                    char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < temp.length; j++) {
                            if (temp[j] == numbers[i]) {
                                temp[j] = 'x';
                            }
                        }
                    }
                    replaced = "";
                    for (int i = 0; i < temp.length; i++) {
                        replaced += temp[i];
                    }
                    if (replaced.equals("(xxx) xxx-xxxx") || replaced.equals("xxx-xxx-xxxx")) {
                        System.out.println(line);

                    }
                    line = reader.readLine();
                }
                reader.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    }
