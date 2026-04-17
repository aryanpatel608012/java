import java.io.*;

public class Main {
    public static void main(String[] args) {
        int chars = 0, words = 0, lines = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                words += line.split("\\s+").length;
                chars += line.replace(" ", "").length();
            }

            System.out.println("Lines: " + lines);
            System.out.println("Words: " + words);
            System.out.println("Characters: " + chars);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
