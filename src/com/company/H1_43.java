package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class H1_43 {
    public static void main (String[] args) throws FileNotFoundException{
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter java source code file name: ");
        String javaFileName = userInput.next();

        Scanner scanner = new Scanner(new File(javaFileName));
        int lineNumber = 1;
        String javaFileNameWithExtension = javaFileName + ".txt";
        PrintWriter out = new PrintWriter(new File(javaFileNameWithExtension));

        while (scanner.hasNext()){

            String wordsOnLine = scanner.nextLine();
            out.printf("[%03d]  %s%n",  lineNumber, wordsOnLine);
            lineNumber++;
        }

        scanner.close();
        out.close();
    }
}
