//takes a file with a list separated by \n and outputs a file with the list separated by ","

import java.io.*;

public class TextFormatter
{
    public static void main(String[] args) throws IOException {
        File file = new File("src\\primenumbers.csv");

        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter("primelist.txt"));

        String line;

        while((line = br.readLine()) != null)
        {
            bw.write(line + ", ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
