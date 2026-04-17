import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"));
            bw.write("1 Aarav 80\n2 Raj 75\n3 Neha 90");
            bw.close();

            BufferedReader br = new BufferedReader(new FileReader("students.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
