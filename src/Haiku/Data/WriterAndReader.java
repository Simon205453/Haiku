package Haiku.Data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriterAndReader {

    public Scanner sc = new Scanner(System.in);

    public String askForInput(){
        String input = sc.nextLine();
    return input;
    }
    {
    try(FileWriter fw = new FileWriter("Resources/Testtext.csv");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw))
    {
        out.println("the text");
        out.println("more text");
    } catch (IOException e) {
    }
    }

}
