package Practice_FileHandling;

import java.io.*;

public class File {
    public static void main(String[] args) {
        String fileName = "src/Practice_FileHandling/demo.txt";

        BufferedReader bfr;

        try {
            bfr = new BufferedReader( new FileReader(fileName));
            String crntLine = bfr.readLine();
            System.out.println(crntLine);
            bfr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        FileWriter write;
        try {
            write = new FileWriter(fileName,true);
            BufferedWriter bfw = new BufferedWriter(write);
            bfw.write("jagsgfkhtioehr");
            bfw.newLine();
            bfw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
