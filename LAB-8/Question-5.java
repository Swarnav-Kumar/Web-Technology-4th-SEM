/* Write a java program to capitalize first letter of every 
word in a file and save new content in another file*/
import java.io.*;

public class program9_5 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;
        try {
            reader = new BufferedReader(new FileReader("input.txt")); 
            writer = new BufferedWriter(new FileWriter("output.txt")); 
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.length() > 0) {
                        char[] charArray = word.toCharArray();
                        charArray[0] = Character.toUpperCase(charArray[0]);
                        word = new String(charArray);
                    }
                    writer.write(word + " ");
                }
                writer.newLine();
            }
            System.out.println("Content has been modified and saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
                if (writer != null)
                    writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
